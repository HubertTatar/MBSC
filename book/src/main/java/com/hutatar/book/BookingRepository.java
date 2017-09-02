package com.hutatar.book;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
interface BookingRepository extends PagingAndSortingRepository<Booking, BigInteger>{
    Booking findAllByRestaurantId(BigInteger restaurantId);
    Booking findAllByUserId(BigInteger userId);
    Booking findAllByTableId(BigInteger tableId);
}
