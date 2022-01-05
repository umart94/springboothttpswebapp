package com.website.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.website.model.User;
import com.website.response.AuthenticationResponse;
import com.website.response.GenericResponse;
import com.website.service.RegisterService;

@Controller
public class BaseController {

	
	@Autowired
	private RegisterService registerService;
	@GetMapping("/")
	public String index(Model model) {
		
		return "index";
	}
	
	@GetMapping("/contactus")
	public String contactus(Model model) {
		
		return "contactus";
	}
	
	@GetMapping("/register")
	public String register(@Valid @ModelAttribute("registrationUser") User registrationUser,BindingResult result,Model model) {
		registrationUser.setRole("ROLE_USER");
		return "register";
	}
	
	
	@GetMapping("/login")
	public String login(@Valid @ModelAttribute("user") User user,BindingResult result,Model model,HttpServletRequest request, HttpServletResponse response,HttpSession session) {
		HttpSession requestSession = request.getSession();
		String token = (String)requestSession.getAttribute("token");
		if(token==null){
			
			
			
				return "login";
			
			
			
		} else{
			try {
				response.sendRedirect("/user/index");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	
		
		return "login";
	}
	
	
	@PostMapping("/registeruser")
	public void registeruser(@Valid @ModelAttribute("registrationUser") User registrationUser,BindingResult result,Model model,HttpServletResponse response,HttpSession session) {
		registrationUser.setRole("ROLE_USER");
		if(result.hasErrors()) {
		     //model.addAttribute("errors",result.getAllErrors());
			List<FieldError> errors = result.getFieldErrors();
			ArrayList errorsList = new ArrayList();
		    for (FieldError error : errors ) {
		    	if(error.getField().equals("role")) {
		    		
		    	} else {
		    	errorsList.add(error.getDefaultMessage());
		    	}
		    }
		    session.setAttribute("registerErrors", errorsList);
		    
		} else if(!result.hasErrors()){
		try {
			GenericResponse registerResponse = registerService.registerUser(registrationUser);
			if(registerResponse.getResponseCode().equals("201")) {
				session.setAttribute("registrationSuccessMessage","User was Successfully Registered");
				
			} else if(registerResponse.getResponseCode().equals("400")) {
				session.setAttribute("registrationErrorMessage", "Please try again later.");
				
			} else {
				
			}
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		}
		
		 try {
				response.sendRedirect("/register");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	
	@PostMapping("/loginuser")
	public void loginuser(@Valid @ModelAttribute("user") User user,BindingResult result,Model model,HttpSession session,HttpServletResponse response) {
		user.setRole("ROLE_USER");
		if(result.hasErrors()) {
		    // model.addAttribute("errors",result.getAllErrors());
		     List<FieldError> errors = result.getFieldErrors();
				ArrayList errorsList = new ArrayList();
			    for (FieldError error : errors ) {
			    	if(error.getField().equals("role")) {
			    		
			    	} else {
			    	errorsList.add(error.getDefaultMessage());
			    	}
			    }
			    session.setAttribute("loginErrors", errorsList);
			    try {
					response.sendRedirect("/login");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		   } else if(!result.hasErrors()) {
		try {
			GenericResponse loginResponse = registerService.loginUser(user);
			
			if(loginResponse.getResponseCode().equals("200")) {
				AuthenticationResponse authenticatedTokenFromWebService = (AuthenticationResponse) loginResponse.getData();
				session.setAttribute("token",authenticatedTokenFromWebService.getToken());
				session.setAttribute("loginSuccessMessage","Successfully logged in");
				try {
					response.sendRedirect("/user/index");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				session.setAttribute("loginErrorMessage", "Invalid username or password");
				try {
					response.sendRedirect("/login");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		   }
		
		
	}
	
	
}
