package com.example.TeamProject.service;

import com.example.TeamProject.entity.MedicalOffice;
import com.example.TeamProject.repository.MedicalOfficeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.openmbean.InvalidKeyException;
import java.util.Optional;

@Service
public class MedicalOfficeService {
    private MedicalOfficeDao medicalOfficeDao;

    @Autowired
    public MedicalOfficeService(MedicalOfficeDao medicalOfficeDao) {
        this.medicalOfficeDao = medicalOfficeDao;
    }

    public void addMedicalOffice(MedicalOffice medicalOffice) {
        medicalOfficeDao.save(medicalOffice);
    }

    public Optional<MedicalOffice> getMedicalOffice(Long medicalOfficeId) {
        return medicalOfficeDao.findById(medicalOfficeId);
    }

    public void updateMedicalOffice(Long medicalOfficeId, MedicalOffice updatedMedicalOffice) {
        MedicalOffice medicalOfficeRepo = medicalOfficeDao.findById(medicalOfficeId).orElseThrow(InvalidKeyException::new);
        medicalOfficeRepo.setCity(updatedMedicalOffice.getCity());
        medicalOfficeRepo.setName(updatedMedicalOffice.getName());
        medicalOfficeRepo.setAddress(updatedMedicalOffice.getAddress());
        medicalOfficeRepo.setTelephone(updatedMedicalOffice.getTelephone());
        medicalOfficeRepo.setTaxCode(updatedMedicalOffice.getTaxCode());
        medicalOfficeDao.save(medicalOfficeRepo);
    }

    public void deleteMedicalOffice(Long medicalOfficeId) {
        medicalOfficeDao.deleteById(medicalOfficeId);
    }
}