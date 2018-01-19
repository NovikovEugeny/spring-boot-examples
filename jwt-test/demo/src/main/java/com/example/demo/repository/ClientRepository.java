package com.example.demo.repository;

import com.example.demo.entity.Client;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ClientRepository {

    private List<Client> clients;

    public ClientRepository() {
        clients = new ArrayList<>();

        clients.add(new Client(1, "A", "A@gmail.com", "A12345"));
        clients.add(new Client(2, "B", "B@gmail.com", "B12345"));
        clients.add(new Client(3, "C", "C@gmail.com", "C12345"));
    }

    public void save(Client client) {
        clients.add(client);
    }

    public Client findById(int id) {
        return clients.stream().filter(c -> c.getId() == id).findFirst().orElse(null);
    }

    public Client findByLogin(String login) {
        return clients.stream().filter(c -> c.getLogin().equals(login)).findFirst().orElse(null);
    }

    public List<Client> findAll() {
        return clients;
    }

}
