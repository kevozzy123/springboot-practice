package com.pan.myfriendsapp.api.user.controller;

import com.pan.myfriendsapp.api.user.dto.PostUserRequestBody;
import com.pan.myfriendsapp.api.user.model.User;
import com.pan.myfriendsapp.api.user.service.UserService;
import com.pan.myfriendsapp.core.data.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Handles all the requests that begins with "/users" in the url
@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    // injects UserService from Spring Beans, this is an alternative but preferred way to @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ApiResponse<User> createUser(@RequestBody PostUserRequestBody user) {
        return new ApiResponse(userService.createUser(user));
    }

    @GetMapping
    public ApiResponse<List<User>> getUsers( // map the endpoint url to a function/method
            @RequestParam(defaultValue = "0") int pageNum,
            @RequestParam(defaultValue = "10") int pageSize) {
        return new ApiResponse(userService.getUsers(pageNum, pageSize));
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getFilteredUserById(@PathVariable Long id) {
        return ResponseEntity.ok(userService.getById(id));
    }

    // Update user information
    @PutMapping
    public User updateUserInfo() {
        return null;
    }

    // Delete a user by ID, return only a status
    @DeleteMapping("/{id}")
    public Void deleteUserById() {
        return null;
    }
}