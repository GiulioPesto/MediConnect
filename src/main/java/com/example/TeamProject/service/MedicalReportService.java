package com.example.TeamProject.service;

<<<<<<< HEAD
import com.example.TeamProject.entity.MedicalReportEntity;
import com.example.TeamProject.repository.MedicalReportRepository;
=======
import com.example.TeamProject.entity.MedicalReport;
import com.example.TeamProject.repository.MedicalReportDao;
>>>>>>> 70a22886414510687786d1c622082f075d5b9990
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.openmbean.InvalidKeyException;
import java.util.Optional;

@Service
public class MedicalReportService {
    @Autowired
    MedicalReportRepository medicalReportRepository;

    public void addMedicalReport(MedicalReportEntity medicalReport){
        medicalReportRepository.save(medicalReport);
    }

    public Optional<MedicalReportEntity> getMedicalReport(Long medicalReportId){
        return medicalReportRepository.findById(medicalReportId);
    }

    public void updateMedicalReport(Long medicalReportId, MedicalReportEntity updatedMedicalReport){
        MedicalReportEntity medicalReportRepo = medicalReportRepository.findById(medicalReportId).orElseThrow(InvalidKeyException::new);
        medicalReportRepo.setDescription(updatedMedicalReport.getDescription());
        medicalReportRepository.save(medicalReportRepo);
    }

    public void deleteMedicalReport(Long medicalReportId){
        medicalReportRepository.deleteById(medicalReportId);
    }
}