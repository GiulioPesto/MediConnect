package com.example.TeamProject.controller;
import com.example.TeamProject.entity.BookingEntity;
import com.example.TeamProject.entity.MedicalReportEntity;
import com.example.TeamProject.service.MedicalReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api/medicalReport/")
public class MedicalReportController {
    @Autowired
    private MedicalReportService medicalReportService;

    @PostMapping("create")
    public ResponseEntity<MedicalReportEntity> registerMedicalReport(@RequestBody MedicalReportEntity medicalReport){
        medicalReportService.addMedicalReport(medicalReport);
        return ResponseEntity.ok().build();
    }

    @GetMapping("{id}")
    public ResponseEntity<MedicalReportEntity> viewMedicalReport(@PathVariable("id") Long id) {
        if (medicalReportService.getMedicalReport(id).isPresent()) {
            return ResponseEntity.ok(medicalReportService.getMedicalReport(id).get());
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("getAll")
    public ResponseEntity<Collection<MedicalReportEntity>> viewAllMedicalReports() {
        return ResponseEntity.ok(medicalReportService.getAllMedicalReports());
    }

    @PutMapping("{id}")
    public ResponseEntity<MedicalReportEntity> updateMedicalReport(@PathVariable("id") Long id, @RequestBody MedicalReportEntity medicalReport){
        medicalReportService.updateMedicalReport(id, medicalReport);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("{id}")
    public ResponseEntity<MedicalReportEntity> deleteMedicalReport(@PathVariable("id") Long id){
        medicalReportService.deleteMedicalReport(id);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("deleteAll")
    public ResponseEntity<MedicalReportEntity> deleteAllMedicalReports() {
        medicalReportService.deleteAllMedicalReports();
        return ResponseEntity.ok().build();
    }
}