package by.test.demo.repository.epharm_repository;

import by.test.demo.entity.epharm.Client;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends MongoRepository<Client, Long> {

    Client findByLogin(String login);
    Client findByFullName(String fullName);

}
