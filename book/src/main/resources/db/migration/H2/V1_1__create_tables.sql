    create table booking.bookings (
        id decimal(19,0) not null,
        created_date TIMESTAMP,
        modification_date TIMESTAMP,
        version integer,
        user_id decimal(19,0) not null,
        restaurant_id decimal(19,0) not null,
        table_id decimal(19,0) not null,
        date TIMESTAMP,
        primary key (id)
    );
