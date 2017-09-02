    alter table user.users
        add constraint users_idx_1 unique (id, version);
