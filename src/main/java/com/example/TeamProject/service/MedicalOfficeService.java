package com.example.TeamProject.service;
import com.example.TeamProject.entity.BookingEntity;
import com.example.TeamProject.entity.MedicalOfficeEntity;
import com.example.TeamProject.entity.PatientEntity;
import com.example.TeamProject.enums.AccountActivationStateEnum;
import com.example.TeamProject.repository.MedicalOfficeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.openmbean.InvalidKeyException;
import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MedicalOfficeService {
    @Autowired
    private MedicalOfficeRepository medicalOfficeRepository;

    public void addMedicalOffice(MedicalOfficeEntity medicalOffice) {
        medicalOfficeRepository.save(medicalOffice);
    }

    public Optional<MedicalOfficeEntity> getMedicalOffice(Long medicalOfficeId) {
        return medicalOfficeRepository.findById(medicalOfficeId).stream().filter(a -> a.getActivation()!= AccountActivationStateEnum.NOT_ACTIVE).findFirst();
    }

    public Collection<MedicalOfficeEntity> getAllMedicalOffices() {
        return medicalOfficeRepository.findAll().stream().filter(a -> a.getActivation()!= AccountActivationStateEnum.NOT_ACTIVE).collect(Collectors.toSet());
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
        MedicalOfficeEntity medicalOfficeRepo =  medicalOfficeRepository.findById(medicalOfficeId).orElseThrow(InvalidKeyException::new);
        medicalOfficeRepo.setActivation(AccountActivationStateEnum.NOT_ACTIVE);
        medicalOfficeRepository.save(medicalOfficeRepo);
    }

    public void reactivateMedicalOffice(Long medicalOfficeId) {
        MedicalOfficeEntity medicalOfficeRepo =  medicalOfficeRepository.findById(medicalOfficeId).orElseThrow(InvalidKeyException::new);
        medicalOfficeRepo.setActivation(AccountActivationStateEnum.ACTIVE);
        medicalOfficeRepository.save(medicalOfficeRepo);
    }

    public void deleteAllMedicalOffices() { medicalOfficeRepository.findAll().forEach(a -> deleteMedicalOffice(a.getId())); }
}