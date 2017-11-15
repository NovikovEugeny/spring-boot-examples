package com.example.demo.service;

import com.example.demo.bean.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findByName(String name) {
        return userRepository.findByName(name);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public void save(User user) {

        User testUser = userRepository.findByLogin(user.getLogin());

        if (testUser == null) {
            userRepository.save(user);
        } else {
            System.out.println("not unique");
        }
    }

    @Override
    public User findByLogin(String login) {
        return userRepository.findByLogin(login);
    }
}