package com.example.TeamProject.controller;

import com.example.TeamProject.model.MedicalOffice;
import com.example.TeamProject.service.MedicalOfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping(value = "/api/medicaloffice/")
public class MedicalOfficeController {
    private MedicalOfficeService medicalOfficeService;

    @Autowired
    public MedicalOfficeController(MedicalOfficeService medicalOfficeService) {
        this.medicalOfficeService = medicalOfficeService;
    }

    @PostMapping
    public ResponseEntity<?> registerMedicalOffice(@RequestBody MedicalOffice medicalOffice) {
        medicalOfficeService.addMedicalOffice(medicalOffice);
        return ok().build();
    }

    @GetMapping("{id}")
    public ResponseEntity<MedicalOffice> viewMedicalOffice(@PathVariable("id") Long medicalOfficeId) {
        return ResponseEntity.ok(medicalOfficeService.getMedicalOffice(medicalOfficeId).get());
    }

    @PutMapping("{id}")
    public ResponseEntity<?> updateMedicalOffice(@PathVariable("id") Long medicalOfficeId,
                                                 @RequestBody MedicalOffice updatedMedicalOffice) {
        medicalOfficeService.updateMedicalOffice(medicalOfficeId, updatedMedicalOffice);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteMedicalOffice(@PathVariable("id") Long medicalOfficeId) {
        medicalOfficeService.deleteMedicalOffice(medicalOfficeId);
        return ResponseEntity.ok().build();
    }
}