package com.foodreview.foodreview.model;

import java.io.Serializable;

public class Dish implements Serializable {
    //Variables
    private Long id;
    private String name;
    private String restaurant;
    private Double price;
    private String type;

    public Dish() {
    }

    public Dish(String name, String restaurant, Double price, String type) {
        this.name = name;
        this.restaurant = restaurant;
        this.price = price;
        this.type = type;
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

    public String getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(String restaurant) {
        this.restaurant = restaurant;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
