package com.project.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import com.project.model.LoginEntity;
import com.project.service.LoginService;

import com.project.service.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class SignUpController {

    @Autowired
    private SignUpService signUpService;

    @RequestMapping(value="signupController", method = RequestMethod.POST)
    public boolean createUser(HttpServletRequest request) {
        String name = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        LoginEntity loginEntity = new LoginEntity();
        loginEntity.setUsername(name);
        loginEntity.setEmail(email);
        loginEntity.setPassword(password);

        boolean result = signUpService.createUser(loginEntity);


    }


}
