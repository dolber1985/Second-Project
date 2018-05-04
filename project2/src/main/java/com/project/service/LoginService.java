package com.project.service;

import com.project.model.UserEntity;

public interface LoginService {
	

	public UserEntity authenticateUserByEmail(UserEntity userEntity);


	}
