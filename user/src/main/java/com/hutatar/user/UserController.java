package com.hutatar.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;

@RestController
@RequestMapping("users")
class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    private ResponseEntity<Page<User>> findAll(Pageable pageable) {
        return ResponseEntity.ok(userService.list(pageable));
    }

    @GetMapping("/{user_id}")
    private ResponseEntity<User> getById(@PathVariable("user_id") BigInteger id) {
        return ResponseEntity.ok(userService.findById(id));
    }

    @PostMapping
    private ResponseEntity<User> add(@RequestBody User restaurant) {
        try {
            User user = userService.add(restaurant);
            return ResponseEntity.ok(user);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.UNPROCESSABLE_ENTITY);
        }
    }
}
