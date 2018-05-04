package com.project.model;

import java.io.Serializable;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

@Entity
@Table (name = "CENTERS")
public class WellnessCenterEntity implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long centerID;

    @NotEmpty
    @Column(name="username", nullable=false)
    private String username;

    @NotEmpty
    @Column(name="password", nullable=false)
    private String password;

    @NotEmpty
    @Column(name="name", nullable=false)
    private String name;

    @NotEmpty
    @Column(name="address", nullable=false)
    private String address;

    @NotEmpty
    @Column(name="phone", nullable=false)
    private int phone;

    @NotEmpty
    @Column(name="mail", nullable=false)
    private String mail;

    public long getCenterID() {
        return centerID;
    }

    public void setCenterID(long centerID) {
        this.centerID = centerID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
