package com.nowaitr.nowaitr.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nowaitr.nowaitr.model.Restaurant;
import com.nowaitr.nowaitr.repository.RestaurantRepository;

@Service
public class RestaurantService {

    private RestaurantRepository restaurantRepository;

    public RestaurantService(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    public Restaurant saveRestaurant(Restaurant restaurant) {
        return restaurantRepository.save(restaurant);
    }

    public List<Restaurant> getAllRestaurants() {
        return restaurantRepository.findAll();
    }

    public Restaurant getById(Long id) {
        return restaurantRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        restaurantRepository.deleteById(id);
    }
}