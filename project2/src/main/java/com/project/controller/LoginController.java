package com.project.controller;

import com.project.model.LoginEntity;
import com.project.service.LoginService;

import com.project.util.JSonResponseBody;
import com.project.util.UserNotLoggedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RequestParam;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Optional;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;

	@CrossOrigin
	@RequestMapping(value = "loginController", method = RequestMethod.POST)
	public ResponseEntity<JSonResponseBody> loginUser(@RequestParam(value = "name") String username, @RequestParam(value = "password") String psw) {

		try {
			Optional<LoginEntity> user = loginService.getUserFromDbAndVerifyPassword(username, psw);
			if(user.isPresent()) {
			    LoginEntity userResult = user.get();
			    String jwt = loginService.createJwt(userResult.getId(), userResult.getUsername(), userResult.getEmail(), new Date());
			    return ResponseEntity.status(HttpStatus.OK).header("jwt", jwt).body(new JSonResponseBody(HttpStatus.OK.value(), "User Logged In!"));
            }
		} catch (UserNotLoggedException e) {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body(new JSonResponseBody(HttpStatus.FORBIDDEN.value(), "Login Failed, please retry."));
        } catch (UnsupportedEncodingException e1) {
		    return ResponseEntity.status(HttpStatus.FORBIDDEN).body(new JSonResponseBody(HttpStatus.FORBIDDEN.value(), "Token Error, please check."));
        }
        return ResponseEntity.status(HttpStatus.FORBIDDEN).body(new JSonResponseBody((HttpStatus.FORBIDDEN.value(), "No users found. Sorry :("));
	}

}