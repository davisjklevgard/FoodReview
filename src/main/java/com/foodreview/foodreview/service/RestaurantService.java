package com.foodreview.foodreview.service;

import com.foodreview.foodreview.exceptions.UserNotFoundException;
import com.foodreview.foodreview.models.Restaurant;
import com.foodreview.foodreview.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestaurantService {

    private RestaurantRepository restaurantRepository;

    @Autowired
    public RestaurantService(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    public Restaurant createRestaurant(Restaurant restaurant) {
        // Add any necessary business logic before saving the user
        return restaurantRepository.save(restaurant);
    }

    public Restaurant getRestaurantById(Long id) {
        // Add any necessary business logic for retrieving a user by ID
        return restaurantRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User not found with ID: " + id));
    }

    // Add other CRUD operations and business logic as needed
}
