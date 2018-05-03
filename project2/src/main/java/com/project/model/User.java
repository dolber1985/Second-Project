/*
 ============================================================================
 Name        : User.java
 Author      : Alessio Onori
 Version     : 1.0
 Copyright   : Your copyright notice
 Description : Bean/entity su base del template di Piergiorgio
 ============================================================================
 */

package com.project.model;

//1) JPA
//2) JSR-303
//3) LOMBOK: lo ho completamente rimosso... forse in futuro


import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity                                  //JPA defines an Entity
@Table(name = "USER")                   //JPA (if table name in the DB differs from Class Name)
public class User {


	@Id                               //JPA id of the table
	@Column(name="ID")                //JPA (if column name is different from variable name)
	@NotEmpty @NotBlank @NotNull      //JSR-303 Validation
	private int id;

	@Column(name="USERNAME")
	@NotEmpty @NotBlank @NotNull
	private String username;

	@Column(name="PASSWORD", nullable=false)
	@NotEmpty @NotBlank @NotNull
	private String password;

	@Column(name="EMAIL")
	@NotEmpty @NotBlank @NotNull
	private String email;

	/*
	 * Al momento non utilizzato...
	 */
	//	@Column(name="PERMISSION")        //JPA (if column name is different from variable name)
	//    @NotEmpty @NotBlank @NotNull      //JSR-303 Validation
	//    //@Getter @Setter                   //Lombok annotations
	//    private String permission;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int id, String username, String password, String email) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getEmail() {
		return email;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setEmail(String email) {
		this.email = email;
	}







}
