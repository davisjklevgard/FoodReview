package com.foodreview.foodreview.models;

import java.io.Serializable;
import java.lang.reflect.Array;

public class Restaurant implements Serializable {
    //Variables
    private Long id;
    private String name;
    private String foodType;
    private String address;
    private String phone;
    private Array dish;

    public Restaurant() {
    }

    public Restaurant(String name, String foodType, String address, String phone, Array dish) {
        this.name = name;
        this.foodType = foodType;
        this.address = address;
        this.phone = phone;
        this.dish = dish;
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

    public Array getDish() {
        return dish;
    }

    public void setDish(Array dish) {
        this.dish = dish;
    }
}
