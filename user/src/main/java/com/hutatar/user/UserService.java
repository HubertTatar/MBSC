package com.hutatar.user;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.math.BigInteger;

interface UserService {

    Page<User> list(Pageable pageable);
    User add(User user);
    User update(User user);
    User findById(BigInteger id);
    void delete(User user);
}
