package com.example.TeamProject.controller;
import com.example.TeamProject.entity.BookingEntity;
import com.example.TeamProject.entity.ContractEntity;
import com.example.TeamProject.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping(value = "/api/contract/")
public class ContractController {
    @Autowired
    private ContractService contractService;

    @PostMapping
    public ResponseEntity<ContractEntity> registerContract(@RequestBody ContractEntity contract,
                                                           @RequestParam Long medical_office_id,
                                                           @RequestParam(required = false) Long doctor_id,
                                                           @RequestParam(required = false) Long secretary_id) {
        contractService.addContract(contract, medical_office_id, doctor_id, secretary_id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("{id}")
    public ResponseEntity<ContractEntity> viewContract(@PathVariable("id") Long contrattoId) {
        if (contractService.getContract(contrattoId).isPresent()) {
            return ResponseEntity.ok(contractService.getContract(contrattoId).get());
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("getAll")
    public ResponseEntity<Collection<ContractEntity>> viewAllContracts() {
        return ResponseEntity.ok(contractService.getAllContracts());
    }

    @PutMapping("{id}")
    public ResponseEntity<ContractEntity> updateContract(@PathVariable("id") Long contractId,
                                                         @RequestBody ContractEntity contract) {
        contractService.updateContract(contractId, contract);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("{id}")
    public ResponseEntity<ContractEntity> deleteContract(@PathVariable("id") Long contractId) {
        contractService.deleteContract(contractId);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("deleteAll")
    public ResponseEntity<ContractEntity> deleteAllContracts() {
        contractService.deleteAllContracts();
        return ResponseEntity.ok().build();
    }
}
