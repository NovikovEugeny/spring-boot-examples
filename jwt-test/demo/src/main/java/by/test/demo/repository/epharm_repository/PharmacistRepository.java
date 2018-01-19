package by.test.demo.repository.epharm_repository;

import by.test.demo.entity.epharm.Pharmacist;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PharmacistRepository extends MongoRepository<Pharmacist, Long> {
}
