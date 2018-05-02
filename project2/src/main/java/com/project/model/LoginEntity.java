package com.project.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table (name="USERS")
public class LoginEntity implements Serializable{
	
	@Id
	private String s_username;
	
    @NotEmpty
    @Column(name="s_pword", nullable=false)
    private String s_pword;

 
	public String getUsername() {
		return s_username;
	}
 
	public void setUsername(String username) {
		this.s_username = username;
	}
 
	public String getPassword() {
		return s_pword;
	}
 
	public void setPassword(String password) {
		this.s_pword = password;
	}
}
