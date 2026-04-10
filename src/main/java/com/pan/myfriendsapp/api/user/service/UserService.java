package com.pan.myfriendsapp.api.user.service;

import com.pan.myfriendsapp.api.user.model.User;
import com.pan.myfriendsapp.api.user.repository.UserRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(String name, String email) {
        User user = new User(name, email);
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getById(String id) {
        return userRepository.findById(id);
    }
}