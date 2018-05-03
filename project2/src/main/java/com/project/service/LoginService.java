package com.project.service;

import com.project.model.LoginEntity;
import com.project.model.UserEntity;

public interface LoginService {
	
	public boolean authenticateUser(LoginEntity loginBean);

	public UserEntity authenticateUserByEmail(UserEntity userEntity);


	}
