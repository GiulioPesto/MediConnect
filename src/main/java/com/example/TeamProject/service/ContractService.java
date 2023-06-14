package com.example.TeamProject.service;

import com.example.TeamProject.entity.BookingEntity;
import com.example.TeamProject.entity.ContractEntity;
import com.example.TeamProject.repository.ContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.openmbean.InvalidKeyException;
import java.util.Collection;
import java.util.Optional;

@Service
public class ContractService {
    @Autowired
    private ContractRepository contractRepository;

    public void addContract(ContractEntity contract) {
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
