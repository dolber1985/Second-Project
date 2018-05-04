package com.project.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import com.project.model.UserEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class LoginDaoImpl implements LoginDao {

	@PersistenceContext
	 public EntityManager entityManager;

	private final static String LOGIN_STUDENT = "SELECT u FROM UserEntity u WHERE u.istitutional_email=?";


	public UserEntity getLoginByIstitutionalEmail(String istEmail) {

		UserEntity u = null;
		try {
			if(entityManager.createQuery(LOGIN_STUDENT).setParameter(1, istEmail).getSingleResult()!=null)
			{
				u = (UserEntity) entityManager.createQuery(LOGIN_STUDENT).setParameter(1, istEmail).getSingleResult();
			}
		}catch(Exception e){
			System.out.println("Utente non trovato");
		}
		return u;
	}

}
