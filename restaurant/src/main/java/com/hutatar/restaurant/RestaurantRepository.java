package com.hutatar.restaurant;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
interface RestaurantRepository extends PagingAndSortingRepository<Restaurant, BigInteger> {
    Page<Restaurant> findByName(String name, Pageable pageable);
}
