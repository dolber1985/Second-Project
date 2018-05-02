package com.project.dao;

import com.project.model.LoginEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface LoginDao {
	//public boolean authenticateUser(LoginEntity loginBean);
	public LoginEntity getLoginById(String username);

	
	@Query(value = "SELECT * FROM user WHERE username =:name OR email =:name", nativeQuery = true)
    Optional<LoginEntity> findByNameOrEmailAndPassword(String name, String password);

}
