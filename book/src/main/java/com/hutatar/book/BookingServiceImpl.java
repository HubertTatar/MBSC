package com.hutatar.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Service
class BookingServiceImpl implements BookingService {

    private BookingRepository bookingRepository;
    private DiscoveryClient discoveryClient;
    private RestaurantClient restaurantClient;

    @Autowired
    public BookingServiceImpl(BookingRepository bookingRepository, DiscoveryClient discoveryClient, RestaurantClient restaurantClient) {
        this.bookingRepository = bookingRepository;
        this.discoveryClient = discoveryClient;
        this.restaurantClient = restaurantClient;
    }

    @Override
    public Page<Booking> list(Pageable pageable) {
        return bookingRepository.findAll(pageable);
    }

    @Override
    public Booking add(Booking booking) {
        return bookingRepository.save(booking);
    }

    @Override
    public Booking update(Booking booking) {
        return bookingRepository.save(booking);
    }

    @Override
    public Booking findById(BigInteger id) {
        return bookingRepository.findOne(id);
    }

    @Override
    public Booking findAllByRestaurantId(BigInteger restaurantId) {
        return bookingRepository.findAllByRestaurantId(restaurantId);
    }

    @Override
    public Booking findAllByBookingId(BigInteger bookingId) {
        return bookingRepository.findOne(bookingId);
    }

    @Override
    public Booking findAllByUserId(BigInteger userId) {
        return bookingRepository.findAllByUserId(userId);
    }

    @Override
    public Booking findAllByTableId(BigInteger tableId) {
        return bookingRepository.findAllByTableId(tableId);
    }

    @Override
    public void delete(Booking booking) {
        bookingRepository.delete(booking);
    }

    @Override
    public String restaurantInstances() {
        List<ServiceInstance> restaurant = discoveryClient.getInstances("restaurant");
        return restaurant
                .stream()
                .map(i -> i.getUri().toString())
                .collect(Collectors.joining(", "));
    }

    @Override
    public String userInstances() {
        List<ServiceInstance> user = discoveryClient.getInstances("user");
        return user
                .stream()
                .map(i -> i.getUri().toString())
                .collect(Collectors.joining(", "));
    }

    @Override
    public Collection<Restaurant> getRestaurants(String name) {
        return restaurantClient.getRestaurants(name);
    }
}
