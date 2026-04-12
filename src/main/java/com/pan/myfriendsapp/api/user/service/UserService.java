package com.pan.myfriendsapp.api.user.service;

import com.pan.myfriendsapp.api.user.model.User;
import com.pan.myfriendsapp.api.user.repository.UserRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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

    public List<User> getUsers(int pageNum, int pageSize) {
        pageSize = pageSize == 0 ? 20 : pageSize;
        Pageable pageable = PageRequest.of(pageNum, pageSize);
        Page<User> users = userRepository.findAll(pageable);

        return users.getContent();
    }

    public User getById(String id) {
        return userRepository.findById(id);
    }
}