package com.example.demo.controller;

import com.example.demo.bean.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
public class TestController {

    @Autowired
    private UserService userService;

    private String message;

    @RequestMapping("/")
    public String test() {//Model model) {

       /* model.addAttribute("message", "Zhenya");

        int age = userService.findByName("Ekaterina").getAge();
        model.addAttribute("age", age);

        List<User> users = userService.findAllUsers();
        model.addAttribute("users", users);
*/
        return "index";
    }
/*
    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public ModelAndView student() {
        System.out.println("model and view");
        return new ModelAndView("welcome", "command", new User());
    }
*/

    //mvn spring-boot:run

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test2() {
        System.out.println("go to test");
        return "test";
    }

/*
    @RequestMapping(value = "/welcome", method = RequestMethod.POST)
    public String addStudent(@ModelAttribute() User user, Model model) {
        model.addAttribute("name", user.getName());
        model.addAttribute("age", user.getAge());
        model.addAttribute("id", user.getId());

        return "model";
    }
*/

    @GetMapping("/mod")
    public String test10(Model model) {
        System.out.println("/mod");
        model.addAttribute("data", message);
        return "model";
    }

/*
    //@RequestMapping(value = "/models", method = {RequestMethod.POST, RequestMethod.GET})
    @PostMapping("/models")
    public String test3(@RequestParam(value = "message") String message, Model model, RedirectAttributes ra, HttpServletResponse response) throws IOException {
        System.out.println("post");
        System.out.println(message);
        this.message = message;
        //model.addAttribute("data", message);
        //ra.addAttribute("data", message);
        //response.sendRedirect("test");
        return "redirect:/mod";
    }
   */

    @PostMapping("/models")
    @ResponseBody
    public String ajax(@RequestParam(value = "message") String message, Model model, RedirectAttributes ra, HttpServletResponse response) throws IOException {
        System.out.println("post ajax");
        System.out.println(message);

        return message;
    }

    @PostMapping("/showUserList")
    public void showUserList(@RequestBody User user) {//@RequestBody User user) {
        System.out.println("ok");
        System.out.println(user.getName() + "/" + user.getId() + "/" + user.getAge());
    }


}