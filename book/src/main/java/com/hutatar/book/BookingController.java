package com.hutatar.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
@RequestMapping("booking")
class BookingController {

    private BookingService bookingService;

    @Autowired
    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @GetMapping
    private ResponseEntity<Page<Booking>> findAll(Pageable pageable) {
        return ResponseEntity.ok(bookingService.list(pageable));
    }

    @GetMapping("/{booking_id}")
    private ResponseEntity<Booking> getAllByBookingId(@PathVariable("booking_id") BigInteger id) {
        return ResponseEntity.ok(bookingService.findAllByBookingId(id));
    }


    @GetMapping("/user/{user_id}")
    private ResponseEntity<Booking> getByUserId(@PathVariable("user_id") BigInteger id) {
        return ResponseEntity.ok(bookingService.findAllByUserId(id));
    }

    @GetMapping("/restaurant/{restaurant_id}")
    private ResponseEntity<Booking> getByRestaurantId(@PathVariable("restaurant_id") BigInteger id) {
        return ResponseEntity.ok(bookingService.findAllByRestaurantId(id));
    }

    @GetMapping("/table/{table_id}")
    private ResponseEntity<Booking> getByTableId(@PathVariable("table_id") BigInteger id) {
        return ResponseEntity.ok(bookingService.findAllByTableId(id));
    }
}
