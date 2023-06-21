package com.example.TeamProject.service;
import com.example.TeamProject.entity.MedicalReportEntity;
import com.example.TeamProject.repository.DoctorRepository;
import com.example.TeamProject.repository.MedicalReportRepository;
import com.example.TeamProject.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.openmbean.InvalidKeyException;
import java.util.Collection;
import java.util.Optional;

@Service
public class MedicalReportService {
    @Autowired
    private MedicalReportRepository medicalReportRepository;
    @Autowired
    private DoctorRepository doctorRepository;
    @Autowired
    private PatientRepository patientRepository;

    public void addMedicalReport(MedicalReportEntity medicalReport, Long doctor_id, Long patient_id){
        medicalReport.setDoctor(doctorRepository.findById(doctor_id).orElseThrow());
        medicalReport.setPatient(patientRepository.findById(patient_id).orElseThrow());
        medicalReportRepository.save(medicalReport);
    }

    public Optional<MedicalReportEntity> getMedicalReport(Long medicalReportId){
        return medicalReportRepository.findById(medicalReportId);
    }

    public Collection<MedicalReportEntity> getAllMedicalReports() {
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

    public void deleteAllMedicalReports() { medicalReportRepository.deleteAll(); }
}