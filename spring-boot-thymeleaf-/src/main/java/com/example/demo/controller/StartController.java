package com.example.demo.controller;


import com.example.demo.bean.User;
import com.example.demo.resource.AttributeName;
import com.example.demo.resource.PageName;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class StartController {

    @GetMapping("/")
    public String goToStartPage(Model model) {
        model.addAttribute(AttributeName.USER, new User());
        return PageName.START;
    }

}