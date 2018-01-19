package by.test.demo.service;

import by.test.demo.entity.epharm.Client;
import by.test.demo.repository.epharm_repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestSecurityService {

    @Autowired
    private ClientRepository clientRepository;

    public boolean authTest(String login, String password) {
        Client client = clientRepository.findByLogin(login);

        if (client == null) {
            return false;
        }

        return password.equals(client.getPassword());
    }

}
