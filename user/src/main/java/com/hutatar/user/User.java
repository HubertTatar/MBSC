package com.hutatar.user;

import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Table(name = "users", schema="user", indexes = {
        @Index(columnList = "id, version", unique = true, name="users_idx_1")
})
class User extends AbstractEntity {
    private String address;
    private String city;
    private String phoneNo;


    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getPhoneNo() {
        return phoneNo;
    }
}
