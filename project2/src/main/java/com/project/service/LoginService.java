package com.project.service;

import com.project.model.LoginEntity;
import com.project.util.UserNotLoggedException;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Optional;

public interface LoginService {
	
	Optional<LoginEntity> getUserFromDbAndVerifyPassword(String name, String password) throws UserNotLoggedException;

	String createJwt(String subject, String name, String permission, Date datenow) throws UnsupportedEncodingException;
}
