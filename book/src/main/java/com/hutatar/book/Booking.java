package com.hutatar.book;

import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;
import java.math.BigInteger;
import java.time.LocalDateTime;

@Entity
@Table(name = "bookings", schema="booking", indexes = {
        @Index(columnList = "id, version", unique = true, name="bookings_idx_1")
})
class Booking extends AbstractEntity {

    private BigInteger restaurantId;
    private BigInteger userId;
    private LocalDateTime date;
    private BigInteger tableId;

    public BigInteger getRestaurantId() {
        return restaurantId;
    }

    public BigInteger getUserId() {
        return userId;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public BigInteger getTableId() {
        return tableId;
    }
}
