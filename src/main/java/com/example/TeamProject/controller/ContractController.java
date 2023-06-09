package com.example.TeamProject.controller;

import com.example.TeamProject.model.Contract;
import com.example.TeamProject.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/contract/")
public class ContractController {
    private ContractService contractService;

    @Autowired
    public ContractController(ContractService contractService) {
        this.contractService = contractService;
    }

    @PostMapping
    public ResponseEntity<?> registerContract(@RequestBody Contract contract) {
        contractService.addContract(contract);
        return ResponseEntity.ok().build();
    }

    @GetMapping("{id}")
    public ResponseEntity<Contract> visualizeContract(@PathVariable("id") Long contrattoId) {
        return ResponseEntity.ok(contractService.getContract(contrattoId).get());
    }

    @PutMapping("{id}")
    public ResponseEntity<?> updateContract(@PathVariable("id") Long contractId,
                                               @RequestBody Contract contract) {
        contractService.updateContract(contractId, contract);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteContract(@PathVariable("id") Long contractId) {
        contractService.deleteContract(contractId);
        return ResponseEntity.ok().build();
    }
}
