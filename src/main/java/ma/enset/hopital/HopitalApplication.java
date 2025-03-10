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
        patient.setNom("Saad");
        patient.setDateNaissance(new Date());
        patient.setMalade(false);
        patient.setScore(129);
        patientRepository.save(patient);

        Patient patient2=new Patient(null,"David",new Date(),false,225);
        patientRepository.save(patient2);

        Patient patient3=Patient.builder()
                .nom("Sara")
                .dateNaissance(new Date())
                .score(134)
                .malade(true)
                .build();
        patientRepository.save(patient3);






    }
}
