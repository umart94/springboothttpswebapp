package com.securejwt.controller;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.securejwt.dto.UserDTO;
import com.securejwt.entity.DAOUser;
import com.securejwt.request.AuthenticationRequest;
import com.securejwt.response.AuthenticationResponse;
import com.securejwt.response.GenericResponse;
import com.securejwt.service.CustomUserDetailsService;
import com.securejwt.util.Constants;
import com.securejwt.util.JwtUtil;

import io.jsonwebtoken.impl.DefaultClaims;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Authorization;

@Api(tags = "Authentication Controller")
@RestController
@CrossOrigin
public class AuthenticationController {

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private CustomUserDetailsService userDetailsService;

	@Autowired
	private JwtUtil jwtUtil;

	@ApiOperation(value = "Authenticate", notes = "Authenticate Function")
	@RequestMapping(value = ApiController.AUTHENTICATE_URL, method = RequestMethod.POST)
	public GenericResponse createAuthenticationToken(@Valid @RequestBody AuthenticationRequest authenticationRequest,BindingResult result)
			throws Exception {
		
		if(result.hasErrors()) {
			return new GenericResponse(Constants.ResponseCodes.BADREQUEST_400,Constants.ResponseDescription.USER_NOT_REGISTERED);
		}
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
					authenticationRequest.getUsername(), authenticationRequest.getPassword()));
		} catch (DisabledException e) {
			throw new Exception("USER_DISABLED", e);
		}
		catch (BadCredentialsException e) {
			throw new Exception("INVALID_CREDENTIALS", e);
		}
		
		UserDetails userdetails = userDetailsService.loadUserByUsername(authenticationRequest.getUsername());
		String token = jwtUtil.generateToken(userdetails);
		String expiry = jwtUtil.getTokenExpiry(token);
		return new GenericResponse(Constants.ResponseCodes.OK_200,Constants.ResponseDescription.TOKEN_GENERATED,new AuthenticationResponse(expiry,token));
	}
	
	@ApiOperation(value = "Register", notes = "Register Function")
	@RequestMapping(value = ApiController.REGISTER_URL, method = RequestMethod.POST)
	public GenericResponse saveUser(@Valid @RequestBody UserDTO user,BindingResult result) throws Exception {
		
		if(result.hasErrors()) {
			return new GenericResponse(Constants.ResponseCodes.BADREQUEST_400,Constants.ResponseDescription.USER_NOT_REGISTERED);
		}
		
		
			DAOUser userReturnedFromuserDetailsService = userDetailsService.save(user);
			if(userReturnedFromuserDetailsService==null) {
				return new GenericResponse(Constants.ResponseCodes.BADREQUEST_400,Constants.ResponseDescription.UNABLE_TO_PROCESS,null);
					
			} else if(!(userReturnedFromuserDetailsService==null)) {
						return new GenericResponse(Constants.ResponseCodes.CREATED_201,Constants.ResponseDescription.USER_REGISTERED,userReturnedFromuserDetailsService);
						
			}
		
			return new GenericResponse(Constants.ResponseCodes.BADREQUEST_400,Constants.ResponseDescription.UNABLE_TO_PROCESS,null);
			
		
	}
	
	@ApiOperation(value = "refreshtoken", notes = "refreshtoken", authorizations = {@Authorization(value="jwtToken")})
	@RequestMapping(value = ApiController.REFRESH_TOKEN, method = RequestMethod.GET)
	@ApiImplicitParam(name = "isRefreshToken", value = "isRefreshToken", required = true, allowEmptyValue = false, paramType = "header", dataTypeClass = String.class, example = "true")
	
	public  GenericResponse<AuthenticationResponse> refreshtoken(HttpServletRequest request) throws Exception {
		// From the HttpRequest get the claims
		DefaultClaims claims = null;
		try {
			claims = (io.jsonwebtoken.impl.DefaultClaims) request.getAttribute("claims");
			if(claims==null) {
				return new GenericResponse(Constants.ResponseCodes.BADREQUEST_400,Constants.ResponseDescription.UNABLE_TO_PROCESS);
				
			}
		} catch(Exception e) {
			
		}
		Map<String, Object> expectedMap = getMapFromIoJsonwebtokenClaims(claims);
		String token = jwtUtil.doGenerateRefreshToken(expectedMap, expectedMap.get("sub").toString());
		String expiry = jwtUtil.getTokenExpiry(token);
		return new GenericResponse<AuthenticationResponse>(Constants.ResponseCodes.OK_200,Constants.ResponseDescription.TOKEN_GENERATED,new AuthenticationResponse(expiry,token));
	}

	public Map<String, Object> getMapFromIoJsonwebtokenClaims(DefaultClaims claims) {
		Map<String, Object> expectedMap = new HashMap<String, Object>();
		for (Entry<String, Object> entry : claims.entrySet()) {
			expectedMap.put(entry.getKey(), entry.getValue());
		}
		return expectedMap;
	}
	
//	@ResponseStatus(HttpStatus.BAD_REQUEST)
//    @ExceptionHandler(MethodArgumentNotValidException.class)
//    public Map<String, String> handleValidationExceptions(
//            MethodArgumentNotValidException ex) {
//        Map<String, String> errors = new HashMap<>();
//        ex.getBindingResult().getAllErrors().forEach((error) -> {
//            String fieldName = ((FieldError) error).getField();
//            String errorMessage = error.getDefaultMessage();
//            errors.put(fieldName, errorMessage);
//        });
//        return errors;
//    }
}
