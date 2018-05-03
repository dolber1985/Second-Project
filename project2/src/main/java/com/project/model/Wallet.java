/*
 ============================================================================
 Name        : Wallet.java
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
@Table(name = "WALLET")                   //JPA (if table name in the DB differs from Class Name)
public class Wallet {


	@Id                               //JPA id of the table
	@Column(name="ID")                //JPA (if column name is different from variable name)
	@NotEmpty @NotBlank @NotNull      //JSR-303 Validation
	private int id;

	@Column(name="CREDIT")
	@NotEmpty @NotNull @NotBlank
	private double credit;

	@Column(name="ID_USER")
	@NotEmpty @NotNull @NotBlank
	private int idUser;


	public Wallet() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Wallet(int id, double credit, int idUser) {
		super();
		this.id = id;
		this.credit = credit;
		this.idUser = idUser;
	}


	public int getId() {
		return id;
	}


	public double getCredit() {
		return credit;
	}


	public int getIdUser() {
		return idUser;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setCredit(double credit) {
		this.credit = credit;
	}


	public void setId_user(int idUser) {
		this.idUser = idUser;
	}



}
