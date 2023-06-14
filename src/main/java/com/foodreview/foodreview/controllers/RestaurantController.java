package com.foodreview.foodreview.controllers;

import com.foodreview.foodreview.models.Restaurant;
import com.foodreview.foodreview.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {


    private RestaurantService restaurantService;

    @Autowired
    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    @PostMapping
    public ResponseEntity<Restaurant> createRestaurant(@RequestBody Restaurant restaurant) {
        Restaurant createdRestaurant = restaurantService.createRestaurant(restaurant);
        return new ResponseEntity<>(createdRestaurant, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Restaurant> getRestaurantById(@PathVariable Long id) {
        Restaurant restaurant = restaurantService.getRestaurantById(id);
        return new ResponseEntity<>(restaurant, HttpStatus.OK);
    }

    @GetMapping("/{name}")
    public ResponseEntity<Restaurant> getRestaurantByName(@PathVariable String name) {
        Restaurant restaurant = restaurantService.getRestaurantByName(name);
        return new ResponseEntity<>(restaurant, HttpStatus.OK);
    }

    // Add other CRUD operations as needed
}
