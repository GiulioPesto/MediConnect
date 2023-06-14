package com.example.TeamProject.service;
import com.example.TeamProject.entity.MedicalReportEntity;
import com.example.TeamProject.repository.MedicalReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.openmbean.InvalidKeyException;
import java.util.Collection;
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

    public Collection<MedicalReportEntity> getAllMedicalReport() {
        return medicalReportRepository.findAll();
    }

    public void updateMedicalReport(Long medicalReportId, MedicalReportEntity updatedMedicalReport){
        MedicalReportEntity medicalReportRepo = medicalReportRepository.findById(medicalReportId).orElseThrow(InvalidKeyException::new);
        medicalReportRepo.setDescription(updatedMedicalReport.getDescription());
        medicalReportRepository.save(medicalReportRepo);
    }

    public void deleteMedicalReport(Long medicalReportId){
        medicalReportRepository.deleteById(medicalReportId);
    }

    public void deleteAllMedicalReports() {medicalReportRepository.deleteAll();}
}