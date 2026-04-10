package com.pan.myfriendsapp.api.user.controller;

import com.pan.myfriendsapp.api.user.model.User;
import com.pan.myfriendsapp.api.user.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Handles all the requests that begins with "/users" in the url
@RestController("/users")
public class UserController {

    private final UserService userService;

    // injects UserService from Spring Beans, this is an alternative but preferred way to @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.createUser(user.getName(), user.getEmail());
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getFilteredUserById(@PathVariable String userId) {
        return userService.getById(userId);
    }
}