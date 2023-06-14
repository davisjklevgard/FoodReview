package com.foodreview.foodreview.exceptions;

public class RestaurantNotFoundException extends RuntimeException{

    public RestaurantNotFoundException(String message) {
        super(message);
    }
}
