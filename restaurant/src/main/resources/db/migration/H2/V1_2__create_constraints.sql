    alter table restaurant.restaurants
        add constraint restaurants_idx_1 unique (id, version);

    alter table restaurant.tables
        add constraint tables_idx_1 unique (id, version);

    alter table restaurant.tables
        add constraint tables_fk1
        foreign key (restaurant_id)
        references restaurant.restaurants;