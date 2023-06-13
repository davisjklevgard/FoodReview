package com.foodreview.foodreview.service;

import com.foodreview.foodreview.models.User;
import com.foodreview.foodreview.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    @Test
    public void createUser_ValidUser_ReturnsCreatedUser() {
        // Create a mock user
        User user = new User();
        user.setId(1L);
        user.setUsername("john.doe");
        user.setEmail("john.doe@example.com");

        // Configure the mock repository
        when(userRepository.save(any(User.class))).thenReturn(user);

        // Call the service method
        User createdUser = userService.createUser(user);

        // Verify the mock repository interactions
        verify(userRepository, times(1)).save(user);

        // Assertions
        assertEquals(user.getId(), createdUser.getId());
        assertEquals(user.getUsername(), createdUser.getUsername());
        assertEquals(user.getEmail(), createdUser.getEmail());
    }

    // Add other test methods for the UserService class
}
