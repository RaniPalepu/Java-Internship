package com.pace.springmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class LoginController {
	//hello.html
	
	@RequestMapping("/hello")
	public ModelAndView login(HttpServletRequest request,HttpServletResponse response) {
	String UserName=request.getParameter("userName");
	String password=request.getParameter("password");
	String message;
	if(UserName != null && !UserName.equals("")&& UserName.equals("admin") && password != null && !password.equals("") && password.equals("admin")) {
		message="Welcome "+UserName+"!";
		return new ModelAndView("welcome","message",message);
	}else {
		message="wrong username and password";
		return new ModelAndView("erroorPage","message",message);
	}
}

}
