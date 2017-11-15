package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.SecurityService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StartController {

    @Autowired
    private UserService userService;

    @Autowired
    private SecurityService securityService;

    @GetMapping("/")
    public String start() {
        return "Hello world!!!";
    }

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/register/{name}/{password}")
    public String reg(@PathVariable String name, @PathVariable String password) {

        User user = new User(name, password);

        userService.save(user);

        securityService.autologin(name, password);

        return "Register" + securityService.findLoggedInUsername();
    }

    @GetMapping("/secured")
    public String enter() {
        return securityService.findLoggedInUsername();
    }

    @GetMapping("/isAuth")
    public boolean test() {
        return !SecurityContextHolder.getContext().getAuthentication().getCredentials().toString().equals("");
    }

    @GetMapping("/login/{name}/{password}")
    public String login(@PathVariable String name, @PathVariable String password) {
        securityService.autologin(name, password);
        return "ok";
    }


}
