package com.example.TeamProject.service;
import com.example.TeamProject.entity.BookingEntity;
import com.example.TeamProject.entity.PatientEntity;
import com.example.TeamProject.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.management.openmbean.InvalidKeyException;
import java.util.Collection;
import java.util.Optional;

@Service
public class PatientService {
    @Autowired
    private PatientRepository patientRepository;

    public void addPatient(PatientEntity patient) {
        patientRepository.save(patient);
    }

    public Optional<PatientEntity> getPatient(Long patientId) {
        return patientRepository.findById(patientId);
    }

    public Collection<PatientEntity> getAllPatients() {
        return patientRepository.findAll();
    }

    public void updatePatient(Long patientId, PatientEntity updatedPatient) {
        PatientEntity patientRepo = patientRepository.findById(patientId).orElseThrow(InvalidKeyException::new);
        patientRepo.setFirstName(updatedPatient.getFirstName());
        patientRepo.setLastName(updatedPatient.getLastName());
        patientRepo.setTaxCode(updatedPatient.getTaxCode());
        patientRepo.setTelephone(updatedPatient.getTelephone());
        patientRepo.setEmail(updatedPatient.getEmail());
        patientRepository.save(patientRepo);
    }

    public void deletePatient(Long patientId) {
        patientRepository.deleteById(patientId);
    }

    public void deleteAllPatients() { patientRepository.deleteAll(); }
}