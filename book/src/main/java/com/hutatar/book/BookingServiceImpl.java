package com.hutatar.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
class BookingServiceImpl implements BookingService {

    private BookingRepository bookingRepository;

    @Autowired
    public BookingServiceImpl(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
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
}
