package com.hutatar.book;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.math.BigInteger;

interface BookingService {
    Page<Booking> list(Pageable pageable);
    Booking add(Booking restaurant);
    Booking update(Booking restaurant);
    Booking findById(BigInteger id);
    Booking findAllByRestaurantId(BigInteger restaurantId);
    Booking findAllByBookingId(BigInteger restaurantId);
    Booking findAllByUserId(BigInteger userId);
    Booking findAllByTableId(BigInteger tableId);
    void delete(Booking restaurant);
}
