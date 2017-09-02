    alter table booking.bookings
        add constraint bookings_idx_1 unique (id, version);