package com.hutatar.book;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;

@FeignClient("restaurant")
public interface RestaurantClient {

    @GetMapping(value = "restaurant")
    Collection<Restaurant> getRestaurants(@RequestParam("name") String name);
}
