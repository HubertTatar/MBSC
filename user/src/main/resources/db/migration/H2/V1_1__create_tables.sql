    create table user.users (
        id decimal(19,0) not null,
        created_date TIMESTAMP,
        modification_date TIMESTAMP,
        version integer,
        address varchar(255),
        city varchar(255),
        phone_no varchar(255),
        primary key (id)
    );
