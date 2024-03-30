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
        patient.setScore(23);
        patientRepository.save(patient);

        Patient patient2=new Patient(null,"Yassine",new Date(),false,123);
        patientRepository.save(patient2);

        Patient patient3=Patient.builder()
                .nom("Imane")
                .dateNaissance(new Date())
                .score(56)
                .malade(true)
                .build();
        patientRepository.save(patient3);
        Patient patient4=new Patient(null,"Rayane",new Date(),false,153);
        patientRepository.save(patient4);
        Patient patient5=new Patient(null,"Hamid",new Date(),false,128);
        patientRepository.save(patient5);
        Patient patient6=new Patient(null,"Kamal",new Date(),false,593);
        patientRepository.save(patient6);
        Patient patient7=new Patient(null,"Youssra",new Date(),false,145);
        patientRepository.save(patient7);
        Patient patient8=new Patient(null,"Samir",new Date(),false,298);
        patientRepository.save(patient8);
        Patient patient9=new Patient(null,"Houda",new Date(),false,1723);
        patientRepository.save(patient9);





    }
}
