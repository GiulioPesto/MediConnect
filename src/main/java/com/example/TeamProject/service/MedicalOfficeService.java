package com.example.TeamProject.service;
import com.example.TeamProject.entity.MedicalOfficeEntity;
import com.example.TeamProject.repository.MedicalOfficeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.openmbean.InvalidKeyException;
import java.util.Optional;

@Service
public class MedicalOfficeService {
    @Autowired
    private MedicalOfficeRepository medicalOfficeRepository;

    public void addMedicalOffice(MedicalOfficeEntity medicalOffice) {
        medicalOfficeRepository.save(medicalOffice);
    }

    public Optional<MedicalOfficeEntity> getMedicalOffice(Long medicalOfficeId) {
        return medicalOfficeRepository.findById(medicalOfficeId);
    }

    public void updateMedicalOffice(Long medicalOfficeId, MedicalOfficeEntity updatedMedicalOffice) {
        MedicalOfficeEntity medicalOfficeRepo = medicalOfficeRepository.findById(medicalOfficeId).orElseThrow(InvalidKeyException::new);
        medicalOfficeRepo.setCity(updatedMedicalOffice.getCity());
        medicalOfficeRepo.setName(updatedMedicalOffice.getName());
        medicalOfficeRepo.setAddress(updatedMedicalOffice.getAddress());
        medicalOfficeRepo.setTelephone(updatedMedicalOffice.getTelephone());
        medicalOfficeRepo.setTaxCode(updatedMedicalOffice.getTaxCode());
        medicalOfficeRepository.save(medicalOfficeRepo);
    }

    public void deleteMedicalOffice(Long medicalOfficeId) {
        medicalOfficeRepository.deleteById(medicalOfficeId);
    }
}