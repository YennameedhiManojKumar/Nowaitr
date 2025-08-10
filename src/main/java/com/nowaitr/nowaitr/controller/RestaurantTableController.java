package com.nowaitr.nowaitr.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import com.nowaitr.nowaitr.model.RestaurantTable;
import com.nowaitr.nowaitr.service.RestaurantTableService;
import java.util.List;

@RestController
@RequestMapping("/restaurant-tables")
public class RestaurantTableController {

    private final RestaurantTableService restaurantTableService;

    public RestaurantTableController(RestaurantTableService restaurantTableService) {
        this.restaurantTableService = restaurantTableService;
    }

    @PostMapping
    public RestaurantTable createTable(@RequestBody RestaurantTable restaurantTable) {
        return restaurantTableService.saveRestaurantTable(restaurantTable);
    }

    @GetMapping
    public List<RestaurantTable> getAllTables() {
        return restaurantTableService.getAllRestaurantTables();
    }

    @GetMapping("/{id}")
    public RestaurantTable getTableById(@PathVariable Long id) {
        return restaurantTableService.getTableById(id);
    }

    @PutMapping("/{id}")
    public RestaurantTable updateTable(@PathVariable Long id, @RequestBody RestaurantTable restaurantTable) {
        if (restaurantTableService.getTableById(id) != null) {
            restaurantTable.setId(id);
            return restaurantTableService.saveRestaurantTable(restaurantTable);
        }
        return null;
    }

}
