package ma.enset.hopital;


import ma.enset.hopital.entities.Patient;
import ma.enset.hopital.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;
import java.util.Date;

@SpringBootApplication
public class HopitalApplication implements CommandLineRunner {
    @Autowired
    private PatientRepository patientRepository;


    public static void main(String[] args) {
        SpringApplication.run(HopitalApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        Patient patient = new Patient();
        patient.setId(null);
        patient.setNom("Mohamed");
        patient.setDateNaissance(new Date());
        patient.setMalade(false);
        patient.setScore(203);
        patientRepository.save(patient);

        Patient patient2=new Patient(null,"Yassine",new Date(),false,123);
        patientRepository.save(patient2);

        Patient patient3=Patient.builder()
                .nom("Imane")
                .dateNaissance(new Date())
                .score(156)
                .malade(true)
                .build();
        patientRepository.save(patient3);






    }
}
