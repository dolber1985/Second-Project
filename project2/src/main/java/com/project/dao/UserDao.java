/*
 ============================================================================
 Name        : UserDao.java
 Author      : Alessio Onori
 Version     : 1.0
 Copyright   : Your copyright notice
 Description : Dao dello User su base del template di Piergiorgio
 ============================================================================
 */

package com.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.project.model.User;

import java.util.Optional;

public interface UserDao extends JpaRepository<User, Integer>{

	// === Costanti letterali per non sbagliarsi a scrivere !!! ============================

	static final String TABLE = "USER";

	// -------------------------------------------------------------------------------------

	static final String ID = "id";
	static final String USERNAME = "username";
	static final String EMAIL = "email";
	static final String PASSWORD = "password";
	
	// -------------------------------------------------------------------------------------



	Optional<User> findById(@Param("ID") int id);


	/*
	 * il parametro name può contenere un username o una email, entrambe valide al fine 
	 * dell'autenticazione
	 */
	//custom
	@Query(value = "SELECT * FROM "+TABLE+" WHERE "+USERNAME+" =:name OR "+EMAIL+" =:name AND "+PASSWORD+" =:password", nativeQuery = true)
	Optional<User> readByNameOrEmailAndPassword(@Param("name")String name,@Param("password")String password);
	
	/*
	 * al momento ho gestito tutti i servizi e non ho bisogno di implementazioni
	 */
	
}
