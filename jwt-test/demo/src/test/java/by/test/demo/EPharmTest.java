package by.test.demo;

import by.test.demo.entity.epharm.Client;
import by.test.demo.repository.epharm_repository.ClientRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EPharmTest {

    @Autowired
    private ClientRepository clientRepository;

    @Test
    public void saveTest() {
        Client client = new Client();
        client.setId(1);
        client.setFullName("James Bond");
        client.setLogin("JB-007@gmail.com");
        client.setPassword("Jb123456");

        clientRepository.save(client);
    }

    @Test
    public void findTest() {
        System.out.println(clientRepository.findByLogin("JB-007@gmail.com"));
        System.out.println(clientRepository.findByFullName("James Bond"));
    }
}
