package com.website.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
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
}
