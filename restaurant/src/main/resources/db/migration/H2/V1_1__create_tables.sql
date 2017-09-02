    create table restaurant.restaurants (
        id decimal(19,0) not null,
        created_date TIMESTAMP,
        modification_date TIMESTAMP,
        version integer,
        name varchar(255),
        primary key (id)
    );


    create table restaurant.tables (
        id decimal(19,0) not null,
        created_date TIMESTAMP,
        modification_date TIMESTAMP,
        version integer,
        capacity integer,
        restaurant_id decimal(19,2),
        primary key (id)
    );