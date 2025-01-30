package com.example.mmm.service;

import com.example.mmm.model.User;
import com.example.mmm.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public boolean deleteUserByUsername(String username) {
        if (userRepository.findByUsername(username).isPresent()) {
            userRepository.deleteByUsername(username);
            return true;
        }
        return false;
    }
}