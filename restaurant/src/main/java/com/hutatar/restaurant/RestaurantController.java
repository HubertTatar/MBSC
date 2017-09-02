package com.hutatar.restaurant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;

@RestController
@RequestMapping("restaurant")
class RestaurantController {

    private RestaurantService restaurantService;

    @Autowired
    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    @GetMapping
    private ResponseEntity<Page<Restaurant>> list(Pageable pageable) {
        return ResponseEntity.ok(restaurantService.list(pageable));
    }

    @GetMapping("/{restaurant_id}")
    private ResponseEntity<Restaurant> getById(@PathVariable("restaurant_id") BigInteger id) {
        return ResponseEntity.ok(restaurantService.findById(id));
    }

    @PostMapping
    private ResponseEntity<Restaurant> add(@RequestBody Restaurant restaurant) {
        try {
            Restaurant restaurnat = restaurantService.add(restaurant);
            return ResponseEntity.ok(restaurnat);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.UNPROCESSABLE_ENTITY);
        }
    }

}
