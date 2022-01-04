package com.securejwt.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class UserDTO {
	
	@NotNull(message = "username may not be blank")
	@NotEmpty(message = "username may not be blank")
	@NotBlank(message = "username may not be blank")
	private String username;
	@NotNull(message = "password may not be blank")
	@NotEmpty(message = "password may not be blank")
	@NotBlank(message = "password may not be blank")
	private String password;
	
	@NotNull(message = "role may not be blank")
	@NotEmpty(message = "role may not be blank")
	@NotBlank(message = "role may not be blank")
	private String role;

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

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

}
