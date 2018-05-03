package com.project.controller;

import javax.jws.soap.SOAPBinding;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import com.project.model.LoginEntity;
import com.project.model.UserEntity;
import com.project.service.LoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController{

	@Autowired
    private LoginService loginService;
    
	@RequestMapping(value="/loginController", method = RequestMethod.POST)
	public ModelAndView userCheck(HttpServletRequest request) {
		String email = request.getParameter("username");
		String pwd = request.getParameter("password");


		UserEntity userEntity = new UserEntity();
		userEntity.setIstitutional_email(email);
		userEntity.setPassword(pwd);

		UserEntity result = loginService.authenticateUserByEmail(userEntity);
		
		ModelAndView model = new ModelAndView();

		if (!result.getIstitutional_email().equals(null)){

			model.addObject("user", result);
	    	model.setViewName("success");
			
		}else{

			model.setViewName("error");

		}
		
    	return model;

	}
}
