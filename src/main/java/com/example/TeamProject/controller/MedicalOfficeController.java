package com.example.TeamProject.controller;

import com.example.TeamProject.entity.MedicalOfficeEntity;
import com.example.TeamProject.service.MedicalOfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping(value = "/api/medicalOffice/")
public class MedicalOfficeController {
    @Autowired
    private MedicalOfficeService medicalOfficeService;

    @PostMapping
    public ResponseEntity<MedicalOfficeEntity> registerMedicalOffice(@RequestBody MedicalOfficeEntity medicalOffice) {
        medicalOfficeService.addMedicalOffice(medicalOffice);
        return ok().build();
    }

    @GetMapping("{id}")
    public ResponseEntity<MedicalOfficeEntity> viewMedicalOffice(@PathVariable("id") Long medicalOfficeId) {
        if (medicalOfficeService.getMedicalOffice(medicalOfficeId).isPresent()) {
            return ResponseEntity.ok(medicalOfficeService.getMedicalOffice(medicalOfficeId).get());
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("{id}")
    public ResponseEntity<MedicalOfficeEntity> updateMedicalOffice(@PathVariable("id") Long medicalOfficeId,
                                                                   @RequestBody MedicalOfficeEntity updatedMedicalOffice) {
        medicalOfficeService.updateMedicalOffice(medicalOfficeId, updatedMedicalOffice);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("{id}")
    public ResponseEntity<MedicalOfficeEntity> deleteMedicalOffice(@PathVariable("id") Long medicalOfficeId) {
        medicalOfficeService.deleteMedicalOffice(medicalOfficeId);
        return ResponseEntity.ok().build();
    }
}