package by.test.demo;

import by.test.demo.entity.polyclinic.Doctor;
import by.test.demo.entity.polyclinic.Patient;
import by.test.demo.entity.polyclinic.Prescription;
import by.test.demo.repository.polyclinic_repository.DoctorRepository;
import by.test.demo.repository.polyclinic_repository.PatientRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class PolyclinicTest {

    @Autowired
    private DoctorRepository doctorRepository;

    @Autowired
    private PatientRepository patientRepository;

    @Test
    public void saveTest() {
        Doctor doctor = new Doctor();
        doctor.setId(1L);
        doctor.setFullName("Ivanov Ivan Ivanovich");
        doctor.setGender("male");
        doctor.setPasportId("kv1862623");
        doctor.setMobile("+375293371965");
        doctor.setAddress("Mogilev Nepokorennyh street 84-44");
        doctor.setBirthday(new Date());
        doctor.setHireDate(new Date());
        doctor.setEducation("BSMU, pediatr");

        Prescription prescription = new Prescription();
        prescription.setId(1L);
        prescription.setMedicamentId(1L);
        prescription.setDoctorId(1L);
        prescription.setQuantity(1);
        prescription.setStartDate(new Date());
        prescription.setEndDate(new Date());

        List<Prescription> prescriptions = new ArrayList<>();
        prescriptions.add(prescription);

        Patient patient = new Patient();
        patient.setId(1L);
        patient.setFullName("E N");
        patient.setGender("female");
        patient.setBirthday(new Date());
        patient.setPrescriptions(prescriptions);

        doctorRepository.save(doctor);
        patientRepository.save(patient);

        Prescription prescription2 = new Prescription();
        prescription2.setId(2L);
        prescription2.setMedicamentId(2L);
        prescription2.setDoctorId(1L);
        prescription2.setQuantity(1);
        prescription2.setStartDate(new Date());
        prescription2.setEndDate(new Date());

        Prescription prescription3 = new Prescription();
        prescription3.setId(3L);
        prescription3.setMedicamentId(3L);
        prescription3.setDoctorId(1L);
        prescription3.setQuantity(1);
        prescription3.setStartDate(new Date());

        Calendar instance = Calendar.getInstance();
        instance.setTime(new Date());
        instance.add(Calendar.DAY_OF_MONTH, 3);

        prescription3.setEndDate(instance.getTime());

        Patient patient1 = patientRepository.findOne(1L);
        patient1.getPrescriptions().add(prescription2);
        patient1.getPrescriptions().add(prescription2);
        patientRepository.save(patient1);

    }

    @Test
    public void findTest() {
        int medicamentId = 3;
        long patientId = 1;

        boolean isPermit = false;

        List<Prescription> prescriptions = patientRepository.findOne(patientId).getPrescriptions();
        isPermit = prescriptions.stream().anyMatch(
                item -> item.getMedicamentId() == medicamentId &&
                        item.getEndDate().after(new Date())
        );

        System.out.println(isPermit);

    }

}
