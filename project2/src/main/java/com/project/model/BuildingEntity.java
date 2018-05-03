package com.project.model;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "building")
public class BuildingEntity {

    @Id
    private int id;

    @Column(name="name")
    @NotEmpty @NotNull
    private String name;

    @Column(name="address")
    @NotEmpty @NotNull @NotBlank
    private String address;

    @Column(name="city")
    private String city;

    @Column(name="latitude")
    @NotEmpty @NotBlank @NotNull
    private double latitude;

    @Column(name="longitude")
    @NotEmpty @NotBlank @NotNull
    private double longitude;

    @Column(name="type")
    @NotEmpty @NotBlank @NotNull
    private String type;

    @Column(name="price")
    @NotEmpty @NotBlank @NotNull
    private double price;

    @Column(name="area")
    @NotEmpty @NotBlank @NotNull
    private int area;

    @Column(name="E_class")
    @NotEmpty @NotBlank @NotNull
    private String eClass;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String geteClass() {
        return eClass;
    }

    public void seteClass(String eClass) {
        this.eClass = eClass;
    }

}
