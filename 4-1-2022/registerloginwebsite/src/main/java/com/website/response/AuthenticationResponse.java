package com.website.response;


import java.io.Serializable;

public class AuthenticationResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1349030736045063893L;
	private String expiry;
	private String token;

	public AuthenticationResponse(String expiry,String token) {
		this.expiry = expiry;
		this.token = token;
	}

	public AuthenticationResponse() {
	}

	
	
	public String getExpiry() {
		return expiry;
	}

	

	public String getToken() {
		return token;
	}

	

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}

}