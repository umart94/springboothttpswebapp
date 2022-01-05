package com.website.service.impl;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.website.model.ResponseToken;
import com.website.model.User;
import com.website.request.PostApiRequest;
import com.website.response.AuthenticationResponse;
import com.website.response.GenericResponse;
import com.website.response.GetApiResponse;
import com.website.service.FakeRestApiService;
import com.website.util.Constants;

@Service
public class FakeRestApiImpl implements FakeRestApiService {

	private static final String serverName = "localhost";
	private static final String serverPort = ":8443";
	private static final String scheme = "https://";
	private static final String BASE_URI = "/api/v1/";

	private static final String GET_API = scheme + serverName + serverPort + BASE_URI + "user" + "/getApiResponse";
	private static final String POST_API = scheme + serverName + serverPort + BASE_URI + "user" + "/postApiResponse";
	private static final String REFRESH_TOKEN = scheme +serverName + serverPort + BASE_URI + "refreshtoken";
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public GenericResponse getData(HttpSession session) throws JsonProcessingException {
		GenericResponse response = null;

		HttpHeaders headers = setInitialHeaders();
		headers.set("Authorization", (String) session.getAttribute("token"));
		HttpEntity<String> jwtEntity = new HttpEntity<String>(headers);
		// Use Token to get Response
		try {

			ResponseEntity<GenericResponse> helloResponse = restTemplate.exchange(GET_API, HttpMethod.GET, jwtEntity,
					GenericResponse.class);
			if (helloResponse.getStatusCode().equals(HttpStatus.OK)) {
				response = helloResponse.getBody();
			}

			List<GetApiResponse> listofFakeApiGetResponses = (List<GetApiResponse>) response.getData();
			session.setAttribute("listofFakeApiGetResponses", listofFakeApiGetResponses);

		} catch (Exception ex) {
			if (ex.getMessage().contains("io.jsonwebtoken.ExpiredJwtException")) {
				// Refresh Token
				refreshToken(session);
				// try again with refresh token
				response = getData(session);
			} else {
				System.out.println(ex);
			}
		}
		return response;
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
	public GenericResponse postData(HttpSession session, PostApiRequest postApiRequest) throws JsonProcessingException {
		GenericResponse postApiResponse = null;
		
		try {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("Authorization",(String) session.getAttribute("token"));
		HttpEntity<PostApiRequest> request = new HttpEntity<>(postApiRequest, headers);
		ResponseEntity<GenericResponse> response = restTemplate.postForEntity(POST_API, request, GenericResponse.class);
		GenericResponse genericResult = new GenericResponse<>(Constants.ResponseCodes.OK,Constants.ResponseDescription.OK,response.getBody());
			System.out.println(genericResult);
		} catch(HttpClientErrorException ex) {
			HttpStatus status = ex.getStatusCode();
			
			if(status == HttpStatus.UNAUTHORIZED) {
			
				// Refresh Token
				refreshToken(session);
				// try again with refresh token
				postApiResponse = postData(session, postApiRequest);
			}
			
		}
		
		
		return postApiResponse;
	}
	
	private void refreshToken(HttpSession session) {
		HttpHeaders headers = setInitialHeaders();
		headers.set("Authorization",(String) session.getAttribute("token"));
		headers.set("isRefreshToken", "true");
		HttpEntity<String> jwtEntity = new HttpEntity<String>(headers);
		// Use Token to get Response
		try {ResponseEntity<GenericResponse> refreshTokenResponse = restTemplate.exchange(REFRESH_TOKEN, HttpMethod.GET, jwtEntity,
				GenericResponse.class);
		if (refreshTokenResponse.getStatusCode().equals(HttpStatus.OK)) {
			
			
			
			
			ObjectMapper objectMapper = new ObjectMapper();
			AuthenticationResponse authResponse = objectMapper.convertValue(refreshTokenResponse.getBody().getData(), AuthenticationResponse.class);
			session.removeAttribute("token");
			String token = "Bearer " + authResponse.getToken();
					String expiry = authResponse.getExpiry();
			session.setAttribute("token", token);
			
			
			
			
			
			
			
			
			
			
			
		}
		
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
