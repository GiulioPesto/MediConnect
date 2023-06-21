package com.example.TeamProject.service;

import com.example.TeamProject.entity.BookingEntity;
import com.example.TeamProject.entity.ContractEntity;
import com.example.TeamProject.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.openmbean.InvalidKeyException;
import java.util.Collection;
import java.util.Optional;

@Service
public class ContractService {
    @Autowired
    private ContractRepository contractRepository;
    @Autowired
    private MedicalOfficeRepository medicalOfficeRepository;
    @Autowired
    private DoctorRepository doctorRepository;
    @Autowired
    private SecretaryRepository secretaryRepository;

    public void addContract(ContractEntity contract, Long medical_office_id, Long doctor_id, Long secretary_id) {
        contract.setMedicalOffice(medicalOfficeRepository.findById(medical_office_id).orElseThrow());
        if (doctor_id != null) {
            contract.setDoctor(doctorRepository.findById(doctor_id).orElseThrow());
        } else { contract.setSecretary(secretaryRepository.findById(secretary_id).orElseThrow()); }
        contractRepository.save(contract);
    }

    public Optional<ContractEntity> getContract(Long contractId) {
        return contractRepository.findById(contractId);
    }

    public Collection<ContractEntity> getAllContracts() {
        return contractRepository.findAll();
    }

    public void updateContract(Long contractId, ContractEntity updatedContract) {
        ContractEntity contractRepo = contractRepository.findById(contractId).orElseThrow(InvalidKeyException::new);
        contractRepo.setStartDate(updatedContract.getStartDate());
        contractRepo.setEndDate(updatedContract.getEndDate());
        contractRepo.setSalary(updatedContract.getSalary());
        contractRepository.save(contractRepo);
    }

    public void deleteContract(Long contractId) {
        contractRepository.deleteById(contractId);
    }

    public void deleteAllContracts() { contractRepository.deleteAll(); }
}
