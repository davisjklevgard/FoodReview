package com.foodreview.foodreview.service;

import com.foodreview.foodreview.exceptions.UserNotFoundException;
import com.foodreview.foodreview.models.User;
import com.foodreview.foodreview.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user) {
        // Add any necessary business logic before saving the user
        return userRepository.save(user);
    }

    public User getUserById(Long id) {
        // Add any necessary business logic for retrieving a user by ID
        return userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User not found with ID: " + id));
    }

    // Add other CRUD operations and business logic as needed
}
