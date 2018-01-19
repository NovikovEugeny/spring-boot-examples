package by.test.demo.repository.polyclinic_repository;

import by.test.demo.entity.polyclinic.Patient;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends MongoRepository<Patient, Long> {
}
