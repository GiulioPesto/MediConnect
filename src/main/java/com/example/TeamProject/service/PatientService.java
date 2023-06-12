package com.example.TeamProject.service;

import com.example.TeamProject.entity.Patient;
import com.example.TeamProject.repository.PatientDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.openmbean.InvalidKeyException;
import java.util.Optional;

@Service
public class PatientService {
    private PatientDao patientDao;

    @Autowired
    public PatientService(PatientDao patientDao) {
        this.patientDao = patientDao;
    }

    public void addPatient(Patient patient) {
        patientDao.save(patient);
    }

    public Optional<Patient> getPatient(Long patientId) {
        return patientDao.findById(patientId);
    }

    public void updatePatient(Long patientId, Patient updatedPatient) {
        Patient patientRepo = patientDao.findById(patientId).orElseThrow(InvalidKeyException::new);
        patientRepo.setFirstName(updatedPatient.getFirstName());
        patientRepo.setLastName(updatedPatient.getLastName());
        patientRepo.setTaxCode(updatedPatient.getTaxCode());
        patientRepo.setTelephone(updatedPatient.getTelephone());
        patientRepo.setEmail(updatedPatient.getEmail());
        patientDao.save(patientRepo);
    }

    public void deletePatient(Long patientId) {
        patientDao.deleteById(patientId);
    }
}