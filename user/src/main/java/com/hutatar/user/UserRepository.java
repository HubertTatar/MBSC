package com.hutatar.user;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
interface UserRepository extends PagingAndSortingRepository<User, BigInteger>{
}
