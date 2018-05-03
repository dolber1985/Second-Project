package com.project.service;

import com.project.model.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.LoginDao;
import com.project.model.LoginEntity;

import javax.jws.soap.SOAPBinding;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	LoginDao loginDao;
	
	 public boolean authenticateUser(LoginEntity loginEntity){
		 UserEntity login = loginDao.getLoginById(loginEntity.getUsername());
		 if(login!=null){
			 if(login.getPassword().equals(loginEntity.getPassword()) && login.getIstitutional_email().equals(loginEntity.getUsername())){
				 return true;
			 }
		 }
		 return false;
	 }

	 public UserEntity authenticateUserByEmail(UserEntity userEntity){
		 UserEntity user = loginDao.getLoginByIstitutionalEmail(userEntity.getIstitutional_email());
		 if(user != null){
			 if(user.getPassword().equals(userEntity.getPassword()) &&
					 user.getIstitutional_email().equals(userEntity.getIstitutional_email())){
			 	return user;
			 }
		 }
		 return new UserEntity();

	 }

}
