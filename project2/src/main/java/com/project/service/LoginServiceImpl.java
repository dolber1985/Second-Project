package com.project.service;

import com.project.util.JwtUtils;
import com.project.util.UserNotLoggedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.LoginDao;
import com.project.model.LoginEntity;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Optional;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginDao loginDao;

	@Override
	public Optional<LoginEntity> getUserFromDbAndVerifyPassword(String name, String password) throws UserNotLoggedException {

		/*

		NEEDS REFACTORING ASAP!

		 */
		Optional<LoginEntity> user = loginDao.findByNameOrEmailAndPassword(name, password);

		if (user.isPresent()) {
			LoginEntity userResult = user.get();
			if (encryptionUtils.decrypt(userResult.getPassword()).equals(password)) {
				System.out.println("Username and Password verified"); //create a log!!!
			} else {
				System.out.println("Username verified. Password not.");
				throw new UserNotLoggedException("User not correctly logged in.");
			}
		}

		return user;
	}

	@Override
	public String createJwt(String subject, String name, String permission, Date datenow) throws UnsupportedEncodingException {
		Date expDate = datenow;
		expDate.setTime(datenow.getTime() + (300 * 1000));
		System.out.println("JWT Creation. Expiration Time: " + expDate.getTime());
		String token = JwtUtils.generateJwt(subject, expDate, name, permission);
		return token;
	}

}
