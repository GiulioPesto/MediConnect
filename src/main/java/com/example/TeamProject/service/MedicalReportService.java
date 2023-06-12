package com.example.TeamProject.service;

import com.example.TeamProject.entity.MedicalReport;
import com.example.TeamProject.repository.MedicalReportDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.openmbean.InvalidKeyException;
import java.util.Optional;

@Service
public class MedicalReportService {

    @Autowired
    MedicalReportDao medicalReportDao;

    public void addMedicalReport(MedicalReport medicalReport){
        medicalReportDao.save(medicalReport);
    }

    public Optional<MedicalReport> getMedicalReport(Long medicalReportId){
        return medicalReportDao.findById(medicalReportId);
    }

    public void updateMedicalReport(Long medicalReportId, MedicalReport updatedMedicalReport){
        MedicalReport medicalReportRepo = medicalReportDao.findById(medicalReportId).orElseThrow(InvalidKeyException::new);
        medicalReportRepo.setDescription(updatedMedicalReport.getDescription());
        medicalReportDao.save(medicalReportRepo);
    }

    public void deleteMedicalReport(Long medicalReportId){
        medicalReportDao.deleteById(medicalReportId);
    }
}