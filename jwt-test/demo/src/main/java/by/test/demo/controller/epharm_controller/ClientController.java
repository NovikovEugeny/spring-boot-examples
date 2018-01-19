package by.test.demo.controller.epharm_controller;

import by.test.demo.entity.epharm.Client;
import by.test.demo.repository.epharm_repository.ClientRepository;
import by.test.demo.service.SecurityService;
import by.test.demo.service.TestSecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/e-pharm/clients")
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private SecurityService securityService;

    @PostMapping("/sign-up")
    public void signUp(@RequestBody Client client) {
        clientRepository.save(client);
    }

    /*@PostMapping("/sign-in")
    public String signIn(@RequestBody Client client, HttpServletResponse response) {
        if (testSecurityService.authTest(client.getLogin(), client.getPassword())) {
            response.addCookie(new Cookie("token", "test-token"));
            return "Welcome";
        } else {
            return "Hren";
        }
    }*/

    @GetMapping("/client/{id}")
    public Client showClientByID(@PathVariable long id, HttpServletResponse response) {
        response.addHeader("test_header", "hello");
        return clientRepository.findOne(id);
    }

    @GetMapping("/show-header")
    public String show(HttpServletRequest request) {
        return request.getHeader("test_header");
    }

    @GetMapping("/other")
    public String test() {
        System.out.println("Hello");
        return "Hello";
    }

}
