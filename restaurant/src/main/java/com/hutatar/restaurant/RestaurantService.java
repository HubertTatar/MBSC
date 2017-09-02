package com.hutatar.restaurant;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.math.BigInteger;

interface RestaurantService {
    Page<Restaurant> list(Pageable pageable);
    Restaurant add(Restaurant restaurant);
    Restaurant update(Restaurant restaurant);
    Restaurant findById(BigInteger id);
    Page<Restaurant> findByName(String name, Pageable pageable);
    void delete(Restaurant restaurant);

}
