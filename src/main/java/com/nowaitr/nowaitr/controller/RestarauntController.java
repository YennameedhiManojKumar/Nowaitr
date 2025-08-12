package com.nowaitr.nowaitr.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nowaitr.nowaitr.model.Restaurant;
import com.nowaitr.nowaitr.service.RestaurantService;

import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/restaurants")
@Tag(name = "Restaurant Management", description = "Operations related to restaurant management")
public class RestarauntController {

    private final RestaurantService restaurantService;

    public RestarauntController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    @PostMapping
    public Restaurant createRestaurant(@RequestBody Restaurant restaurant) {
        return restaurantService.saveRestaurant(restaurant);
    }

    @GetMapping
    public Restaurant getRestaurant(@RequestParam Long id) {
        return restaurantService.getRestaurantById(id);
    }

    @GetMapping("/all")
    public Iterable<Restaurant> getAllRestaurants() {
        return restaurantService.getAllRestaurants();
    }

    @PutMapping("path/{id}")
    public Restaurant updateRestaurant(@PathVariable Long id, @RequestBody Restaurant restaurant) {
        return restaurantService.updateRestaurant(id, restaurant);
    }

    @DeleteMapping("path/{id}")
    public void deleteRestaurant(@PathVariable Long id) {
        restaurantService.deleteRestaurant(id);

    }
}
