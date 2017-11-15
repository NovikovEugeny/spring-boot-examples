package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public void save(User user) {
        UserRepository.getUsers().put(user.getName(), user);
    }

    public User findByUsername(String username) {
        return UserRepository.getUsers().get(username);
    }
}
