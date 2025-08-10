package com.nowaitr.nowaitr.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.nowaitr.nowaitr.model.RestaurantTable;
import com.nowaitr.nowaitr.repository.RestaurantTableRepository;

@Service
public class RestaurantTableService {

    private final RestaurantTableRepository restaurantTableRepository;

    public RestaurantTableService(RestaurantTableRepository restaurantTableRepository) {
        this.restaurantTableRepository = restaurantTableRepository;
    }

    public RestaurantTable saveRestaurantTable(RestaurantTable restaurantTable) {
        return restaurantTableRepository.save(restaurantTable);
    }

    public List<RestaurantTable> getAllRestaurantTables() {
        return restaurantTableRepository.findAll();
    }

    public RestaurantTable getTableById(Long id) {
        return restaurantTableRepository.findById(id).orElse(null);
    }

    public void deleteTableById(Long id) {
        restaurantTableRepository.deleteById(id);
    }

}
