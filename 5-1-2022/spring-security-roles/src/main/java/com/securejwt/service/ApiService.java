package com.securejwt.service;

import com.securejwt.request.PostApiRequest;
import com.securejwt.response.GenericResponse;

public interface ApiService {
	public GenericResponse getResponse();
	public GenericResponse postResponse(PostApiRequest postApiRequest);
	
}
