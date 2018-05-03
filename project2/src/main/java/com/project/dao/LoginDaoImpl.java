package com.project.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import com.project.model.UserEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.project.model.LoginEntity;

@Repository
@Transactional
public class LoginDaoImpl implements LoginDao {

	@PersistenceContext
	 public EntityManager entityManager;
	
	 public UserEntity getLoginById(String username) {

	 	return entityManager.find(UserEntity.class, username);
	 }

	public UserEntity getLoginByIstitutionalEmail(String istEmail) {

		return entityManager.find(UserEntity.class, istEmail);
	}

}
