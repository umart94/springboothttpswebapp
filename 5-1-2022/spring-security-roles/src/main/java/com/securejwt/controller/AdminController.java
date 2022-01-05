package com.securejwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Authorization;
@Api(tags = "Hello World Controller")
@RestController
@RequestMapping(path = ApiController.ADMIN_URL)
public class AdminController {

	
	
	
	@ApiOperation(value = "hello admin", notes = "hello admin", authorizations = {@Authorization(value="jwtToken")})
	@GetMapping({"/helloadmin"})
	public String helloAdmin(){
		return "Hello Admin";
	}
	
	@ApiOperation(value = "hello Admins", notes = "hello Admins", authorizations = {@Authorization(value="jwtToken")})
	@GetMapping({"/helloadmins"})
	public String helloAdmins(){
		return "admin1"+"admin2"+"admin3";
	}
}
