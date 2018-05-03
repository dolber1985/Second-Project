/*
 ============================================================================
 Name        : LoginService.java
 Author      : Alessio Onori
 Version     : 1.0
 Copyright   : Your copyright notice
 Description : Dao dello User su base del template di Piergiorgio
 ============================================================================
 */

package com.project.service;

import java.util.Optional;

import com.project.model.User;

public interface LoginService {
	
//	public boolean authenticateUser(User loginBean);
	
	Optional<User> getUserFromDbAndVerifyPassword(String id, String password)throws Exception;
    //-> userDao.findById(id), encryptionUtils.decrypt(pwd) -> UserNotLoggedException

}
