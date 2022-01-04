package com.website.model;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class User implements Serializable{

	
	@NotNull(message = "username may not be null")
	@NotEmpty(message = "username may not be empty")
	@NotBlank(message = "username may not be blank")
	private String username;
	
	@NotNull(message = "password may not be null")
	@NotEmpty(message = "password may not be empty")
	@NotBlank(message = "password may not be blank")
	private String password;
	
	@NotNull(message = "role may not be null")
	@NotEmpty(message = "role may not be empty")
	@NotBlank(message = "role may not be blank")
	private String role;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	public User() {
		this.role = "ROLE_USER";
	}
	

}