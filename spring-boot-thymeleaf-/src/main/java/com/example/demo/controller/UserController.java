package com.example.demo.controller;

import com.example.demo.bean.User;
import com.example.demo.resource.AttributeName;
import com.example.demo.resource.PageName;
import com.example.demo.resource.ParameterName;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/sign-in")
    public String authorization(@RequestParam(ParameterName.LOGIN) String login, Model model) {

        User user = userService.findByLogin(login);
        System.out.println(user);
        model.addAttribute(AttributeName.NAME, user.getName());
        return PageName.USER_HOME;
    }

    @PostMapping("/sign-up")
    public String registration(@ModelAttribute User user, Model model) {
        System.out.println(user);
        userService.save(user);
        model.addAttribute(AttributeName.NAME, user.getName());
        return PageName.USER_HOME;
    }

    @GetMapping("/check-name")
    @ResponseBody
    public String search(@RequestParam(ParameterName.NAME) String name) {

        String userName = null;

        try {
            userName = userService.findByName(name).getName();
            System.out.println(userName);

        } catch (NullPointerException exc) {
            System.out.println("npe from try-catch");
            userName = "such name not found!";
        }

        return userName;
    }

    @PostMapping("/send-json-obj")//@response status or return with response body!!!!
    //@ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public String receiveJson(@RequestBody User user) {
        userService.save(user);
        return "{}";//!!! have to return a valid json
    }

    @GetMapping("/receive-json-obj")
    @ResponseBody
    public User sendJson(@RequestParam("name") String name) {
        return userService.findByName(name);
    }

    @GetMapping("/receive-json-array")
    @ResponseBody
    public List<User> sendJsonArray() {
        return userService.findAll();
    }

}