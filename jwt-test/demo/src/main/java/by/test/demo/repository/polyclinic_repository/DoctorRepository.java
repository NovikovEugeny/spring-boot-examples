package by.test.demo.repository.polyclinic_repository;

import by.test.demo.entity.polyclinic.Doctor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends MongoRepository<Doctor, Long> {
}
