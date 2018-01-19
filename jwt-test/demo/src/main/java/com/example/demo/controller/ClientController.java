package com.example.demo.controller;


import com.example.demo.entity.Client;
import com.example.demo.repository.ClientRepository;
import com.example.demo.security.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private SecurityService securityService;

    @GetMapping("/client/{id}")
    public Client getClient(@PathVariable int id) {
        return clientRepository.findById(id);
    }

    @GetMapping("/all")
    public List<Client> getAll() {
        return clientRepository.findAll();
    }

    @GetMapping("/test")
    public String test() {
        return "Hello world!!!";
    }

    @PostMapping("/client/add")
    public void add(@RequestBody Client client) {
        clientRepository.save(client);
    }

    @PostMapping("/sign-in")
    public Client signIn(@RequestBody Client client, HttpServletResponse response) {
        System.out.println("controller work");
        return securityService.autologin(client.getLogin(), client.getPassword(), response);
    }

}
