package com.foodreview.foodreview.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.lang.reflect.Array;

@Entity
public class Restaurant implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    // Variables
    private Long id;
    private String name;
    private String foodType;
    private String address;
    private String phone;
    //private Array dish;

    public Restaurant() {
    }

    public Restaurant(String name, String foodType, String address, String phone) {
        this.name = name;
        this.foodType = foodType;
        this.address = address;
        this.phone = phone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

//    public Array getDish() {
//        return dish;
//    }
//
//    public void setDish(Array dish) {
//        this.dish = dish;
//    }
}
