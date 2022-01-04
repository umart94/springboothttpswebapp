package com.securejwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Authorization;

@Api(tags = "Hello World Controller")
@RestController
@RequestMapping(path = ApiController.USER_URL)
public class UserController {
	
	@ApiOperation(value = "refreshtoken", notes = "refreshtoken", authorizations = {@Authorization(value="jwtToken")})
	@GetMapping({"/hellouser"})
	public String helloUser(){
		return "Hello User";
	}
	
	@ApiOperation(value = "refreshtoken", notes = "refreshtoken", authorizations = {@Authorization(value="jwtToken")})
	@GetMapping({"/hellousers"})
	public String helloUsers(){
		return "user1"+"user2"+"user3";
	}
	

}
