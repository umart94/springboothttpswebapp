package com.securejwt.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class AuthenticationRequest {

	@NotNull(message = "username may not be blank")
	@NotEmpty(message = "username may not be blank")
	@NotBlank(message = "username may not be blank")
	private String username;
	
	@NotNull(message = "password may not be blank")
	@NotEmpty(message = "password may not be blank")
	@NotBlank(message = "password may not be blank")
	private String password;

	public AuthenticationRequest(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public AuthenticationRequest() {
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
