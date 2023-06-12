package com.example.TeamProject.controller;

import com.example.TeamProject.entity.MedicalReport;
import com.example.TeamProject.service.MedicalReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/medicalReport/")
public class MedicalReportController {

    private MedicalReportService medicalReportService;

    @Autowired
    public MedicalReportController(MedicalReportService medicalReportService){
        this.medicalReportService = medicalReportService;
    }

    @PostMapping
    public ResponseEntity<?> addMedicalReport(@RequestBody MedicalReport medicalReport){
        medicalReportService.addMedicalReport(medicalReport);
        return ResponseEntity.ok().build();
    }

    @GetMapping("{id}")
    public ResponseEntity<?> getMedicalReport(@PathVariable("id") Long id){
        return ResponseEntity.ok(medicalReportService.getMedicalReport(id).get());
    }

    @PutMapping("{id}")
    public ResponseEntity<?> updateMedicalReport(@PathVariable("id") Long id, @RequestBody MedicalReport medicalReport){
        medicalReportService.updateMedicalReport(id, medicalReport);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteMedicalReport(@PathVariable("id") Long id){
        medicalReportService.deleteMedicalReport(id);
        return ResponseEntity.ok().build();
    }
}