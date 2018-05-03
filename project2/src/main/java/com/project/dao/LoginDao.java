package com.project.dao;

import com.project.model.LoginEntity;
import com.project.model.UserEntity;

public interface LoginDao {
	//public boolean authenticateUser(LoginEntity loginBean);
	public UserEntity getLoginById(String username);

	public UserEntity getLoginByIstitutionalEmail( String istEmail);
}
