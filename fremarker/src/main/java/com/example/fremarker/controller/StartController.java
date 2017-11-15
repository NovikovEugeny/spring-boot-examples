package com.example.fremarker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StartController {

    @GetMapping("/")
    public String test() {
        return "page";
    }

}
