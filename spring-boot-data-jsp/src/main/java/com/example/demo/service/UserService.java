package com.example.demo.service;


import com.example.demo.bean.User;

import java.util.List;

public interface UserService {

    User findByName(String name);

    List<User> findAllUsers();
}