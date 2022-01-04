package com.website.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.website.model.ResponseToken;
import com.website.model.User;
import com.website.response.AuthenticationResponse;
import com.website.response.GenericResponse;
import com.website.service.RegisterService;
import com.website.util.Constants;

@Service
public class RegisterServiceImpl implements RegisterService{
	@Autowired
	private RestTemplate restTemplate;
	
	private static final String serverName = "localhost";
	private static final String serverPort = ":8443";
	private static final String scheme = "https://";
	private static final String BASE_URI = "/api/v1/";
	
	private static final String REGISTRATION_URL = scheme +serverName + serverPort + BASE_URI + "register";
	private static final String AUTHENTICATION_URL = scheme +serverName + serverPort + BASE_URI + "authenticate";
	private static final String HELLO_URL = scheme +serverName + serverPort + BASE_URI + "helloadmin";
	private static final String REFRESH_TOKEN = scheme +serverName + serverPort + BASE_URI + "refreshtoken";
	private String token;
	@Override
	public GenericResponse registerUser(User user) throws JsonProcessingException {
		// TODO Auto-generated method stub
		// create user registration object
		GenericResponse registrationResponsetoPOJO = null;
				User registrationUser = user;
				String registrationUserHTTPPostRequestBody = convertPOJOtoJSON(registrationUser);
				HttpHeaders registrationUserHTTPPostRequestHeaders = setInitialHeaders();
				HttpEntity<String> registrationEntity = new HttpEntity<String>(registrationUserHTTPPostRequestBody, registrationUserHTTPPostRequestHeaders);
				
				
				//Register User
				try { 
					ResponseEntity<String> registrationResponse = restTemplate.exchange(REGISTRATION_URL, HttpMethod.POST,
							registrationEntity, String.class);
					
					
					ObjectMapper mapper = new ObjectMapper();
				registrationResponsetoPOJO = mapper.readValue(registrationResponse.getBody(), GenericResponse.class);
					
						
				} catch(Exception e) {
					registrationResponsetoPOJO = new GenericResponse(Constants.ResponseCodes.BADREQUEST_400,Constants.ResponseDescription.UNABLE_TO_PROCESS,null);
					return registrationResponsetoPOJO;
				}
				
				return registrationResponsetoPOJO;
	}
	
	
	
	private String convertPOJOtoJSON(final User user) throws JsonProcessingException {
		return new ObjectMapper().writeValueAsString(user);
	}
	
	private HttpHeaders setInitialHeaders() {
		HttpHeaders headers = new HttpHeaders();
		headers.set("Content-Type", MediaType.APPLICATION_JSON_VALUE);
		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
		return headers;
	}



	@Override
	public GenericResponse loginUser(User user) throws JsonProcessingException {
		// TODO Auto-generated method stub
		GenericResponse loginResponseToPojo = null;
		// create user authentication object
		User authenticationUser = user;
		// convert the user authentication object to JSON
		String authenticationBody = convertPOJOtoJSON(authenticationUser);
		// create headers specifying that it is JSON request
		HttpHeaders authenticationHeaders = setInitialHeaders();
		HttpEntity<String> authenticationEntity = new HttpEntity<String>(authenticationBody,
				authenticationHeaders);

		// Authenticate User and get JWT
		try { 
		ResponseEntity<GenericResponse> authenticationResponse = restTemplate.exchange(AUTHENTICATION_URL,
				HttpMethod.POST, authenticationEntity, GenericResponse.class);
		// if the authentication is successful		
	
		if (authenticationResponse.getStatusCode().equals(HttpStatus.OK)) {
			ObjectMapper objectMapper = new ObjectMapper();
			AuthenticationResponse authResponse = objectMapper.convertValue(authenticationResponse.getBody().getData(), AuthenticationResponse.class);
			token = "Bearer " + authResponse.getToken();
					String expiry = authResponse.getExpiry();
			loginResponseToPojo = new GenericResponse(Constants.ResponseCodes.OK_200,Constants.ResponseDescription.TOKEN_GENERATED,new AuthenticationResponse(expiry,token));
				}
		
		} catch(Exception e) {
			loginResponseToPojo = new GenericResponse(Constants.ResponseCodes.UNAUTHORIZED_401,Constants.ResponseDescription.INVALID_USERNAME_OR_PASSWORD,null);
			return loginResponseToPojo;
		}
		
		
		
		
		
		
		
		return loginResponseToPojo;
		
		
		
		
		
		
	}
	
	
	private void refreshToken() {
		HttpHeaders headers = setInitialHeaders();
		headers.set("Authorization", token);
		headers.set("isRefreshToken", "true");
		HttpEntity<String> jwtEntity = new HttpEntity<String>(headers);
		// Use Token to get Response
		try {ResponseEntity<ResponseToken> refreshTokenResponse = restTemplate.exchange(REFRESH_TOKEN, HttpMethod.GET, jwtEntity,
				ResponseToken.class);
		if (refreshTokenResponse.getStatusCode().equals(HttpStatus.OK)) {
			token = "Bearer " +refreshTokenResponse.getBody().getToken();
		}
		
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
