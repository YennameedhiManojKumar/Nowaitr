package com.nowaitr.nowaitr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nowaitr.nowaitr.model.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

}
