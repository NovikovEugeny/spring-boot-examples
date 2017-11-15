package com.example.demo.service;


import com.example.demo.bean.User;

import java.util.List;

public interface UserService {

    User findByName(String name);

    User findByLogin(String login);

    List<User> findAll();

    void save(User user);

}