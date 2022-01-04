package com.securejwt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.securejwt.request.PostApiRequest;
import com.securejwt.response.GenericResponse;
import com.securejwt.service.ApiService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Authorization;

@Api(tags = "Hello World Controller")
@RestController
@RequestMapping(path = ApiController.USER_URL)
public class TodosController {
	
	@Autowired
	private ApiService apiService;
	
	
	@ApiOperation(value = "refreshtoken", notes = "refreshtoken", authorizations = {@Authorization(value="jwtToken")})
	@GetMapping({"/getApiResponse"})
	public GenericResponse getApiResponse(){
		
			GenericResponse getAPIResponse = apiService.getResponse();
			return getAPIResponse;
	}
	
	
	@ApiOperation(value = "refreshtoken", notes = "refreshtoken", authorizations = {@Authorization(value="jwtToken")})
	@PostMapping({"/postApiResponse"})
	public GenericResponse postApiResponse(@RequestBody PostApiRequest postApiRequest){
		
			GenericResponse postAPIResponse = apiService.postResponse(postApiRequest);
			return postAPIResponse;
	}
}
