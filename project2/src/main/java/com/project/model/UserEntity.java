package com.project.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="user")
public class UserEntity implements Serializable {

    public UserEntity() {
        super();
    }

    public UserEntity(long id_user, String istitutional_email, String personal_email, String password, String name, String surname, Date date_of_birth, String type) {
        this.id_user = id_user;
        this.istitutional_email = istitutional_email;
        this.personal_email = personal_email;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.date_of_birth = date_of_birth;
        this.type = type;
    }

    @Column(name="id_user", nullable=false)
    private long id_user;

    @Id
    @NotEmpty
    @Column(name="istitutional_email")
    private String istitutional_email;

    @Column(name="personal_email")
    private String personal_email;

    @NotEmpty
    @Column(name="password", nullable=false)
    private String password;

    @Column(name="name")
    private String name;

    @Column(name="surname")
    private String surname;

    @Column(name="date_of_birth")
    private Date date_of_birth;

    @Column(name="type")
    private String type;

    public long getId_user() {
        return id_user;
    }

    public void setId_user(long id_user) {
        this.id_user = id_user;
    }

    public String getIstitutional_email() {
        return istitutional_email;
    }

    public void setIstitutional_email(String istitutional_email) {
        this.istitutional_email = istitutional_email;
    }

    public String getPersonal_email() {
        return personal_email;
    }

    public void setPersonal_email(String personal_email) {
        this.personal_email = personal_email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
