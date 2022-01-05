package com.website.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.website.request.PostApiRequest;
import com.website.service.FakeRestApiService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private FakeRestApiService fakeRestApiService;
	
	@GetMapping("/index")
	public String index(Model model,HttpSession session) {
		
		
		return "user/home";
	}
	
	@GetMapping("/contactus")
	public String contactus(Model model,HttpSession session) {
		
		
		return "user/contactus";
	}
	
	@GetMapping("/sessioninvalidate")
	public void sessioninvalidate(Model model,HttpSession session,HttpServletResponse response) {
		session.removeAttribute("token");
		session.invalidate();
		try {
			response.sendRedirect("/");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@GetMapping("/todos/get")
	public String todosget(Model model,HttpSession session) {
		
		try {
			fakeRestApiService.getData(session);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "user/gettodos";
	}
	
	@GetMapping("/todos/post")
	public String todospost(Model model,HttpSession session) {
		model.addAttribute("postApiRequest", new PostApiRequest()); 
		
		return "user/posttodos";
	}
	
	@PostMapping("/todos/posttodo")
	public String postoneSingleTodo(@Valid @ModelAttribute("postApiRequest") PostApiRequest postApiRequest,BindingResult result,Model model,HttpSession session){
		
		try {
		if(result.hasErrors()) {
			System.out.println("ERROR , CHECK FIELDS AGAIN");
		} else {
			fakeRestApiService.postData(session, postApiRequest);
		}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return "user/posttodos";
	}
	
}
