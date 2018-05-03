package com.project.service;

import com.project.model.LoginEntity;

public interface LoginService {
	
	public String authenticateUser(LoginEntity loginBean);
	public String registrationUserService(LoginEntity signUpBean);

}
