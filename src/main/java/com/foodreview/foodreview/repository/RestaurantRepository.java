package com.foodreview.foodreview.repository;

import com.foodreview.foodreview.models.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Long>{
    Optional<Restaurant> findByName(String name);
}
