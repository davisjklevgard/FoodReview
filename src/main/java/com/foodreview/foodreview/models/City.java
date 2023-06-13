package com.foodreview.foodreview.models;

import java.io.Serializable;
import java.sql.Array;

public class City implements Serializable {
    //Variables
    private Long id;
    private String name;
    private String county;
    private String state;
    private Array restaurants;

    public City() {
    }

    public City(String name, String county, String state, Array restaurants) {
        this.name = name;
        this.county = county;
        this.state = state;
        this.restaurants = restaurants;
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

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Array getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(Array restaurants) {
        this.restaurants = restaurants;
    }
}
