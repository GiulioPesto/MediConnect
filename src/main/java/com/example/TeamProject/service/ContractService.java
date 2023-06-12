package com.example.TeamProject.service;

import com.example.TeamProject.entity.Contract;
import com.example.TeamProject.repository.ContractDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.openmbean.InvalidKeyException;
import java.util.Optional;

@Service
public class ContractService {
    private ContractDao contractDao;

    @Autowired
    public ContractService(ContractDao contractDao) {
        this.contractDao = contractDao;
    }

    public void addContract(Contract contract) {
        contractDao.save(contract);
    }

    public Optional<Contract> getContract(Long contractId) {
        return contractDao.findById(contractId);
    }

    public void updateContract(Long contractId, Contract updatedContract) {
        Contract contractRepo = contractDao.findById(contractId).orElseThrow(InvalidKeyException::new);
        contractRepo.setStartDate(updatedContract.getStartDate());
        contractRepo.setEndDate(updatedContract.getEndDate());
        contractRepo.setSalary(updatedContract.getSalary());
        contractDao.save(contractRepo);
    }

    public void deleteContract(Long contractId) {
        contractDao.deleteById(contractId);
    }
}
