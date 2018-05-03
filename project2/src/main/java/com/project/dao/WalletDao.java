/*
 ============================================================================
 Name        : WalletDao.java
 Author      : Alessio Onori
 Version     : 1.0
 Copyright   : Your copyright notice
 Description : Dao del wallet su base del template di Piergiorgio
 ============================================================================
 */

package com.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.project.model.User;

import java.util.Optional;

public interface WalletDao extends JpaRepository<User, Integer>{

	// === Costanti letterali per non sbagliarsi a scrivere !!! ============================

	static final String TABLE = "WALLET";

	// -------------------------------------------------------------------------------------

	static final String ID = "id";
	static final String ID_USER = "id_user";
	static final String CREDIT = "credit";
	
	// -------------------------------------------------------------------------------------



	Optional<User> findById(@Param("ID") int id);


	/*
	 * id user è un parametro Unique
	 */
	//custom
	@Query(value = "SELECT * FROM "+TABLE+" WHERE "+ID_USER+" =:idUser", nativeQuery = true)
	Optional<User> readByIdUser(@Param("idUser")int idUser);
	
	
	/*
	 * al momento ho gestito tutti i servizi e non ho bisogno di implementazioni
	 */
	
}
