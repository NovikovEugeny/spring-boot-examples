package com.example.demo.repository;

import com.example.demo.entity.User;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {

    private static final Map<String, User> users = new HashMap<>();

    static {
        users.put("James@", new User("James@", "1234"));
        users.put("Jim@", new User("Jim@", "12345"));
    }

    public static Map<String, User> getUsers() {
        return users;
    }

}
