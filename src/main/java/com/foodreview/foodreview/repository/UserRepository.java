package com.foodreview.foodreview.repository;

import com.foodreview.foodreview.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    // Add custom query methods if needed
}
