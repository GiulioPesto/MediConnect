package com.example.TeamProject.controller;

<<<<<<< HEAD
import com.example.TeamProject.entity.MedicalReportEntity;
=======
import com.example.TeamProject.entity.MedicalReport;
>>>>>>> 70a22886414510687786d1c622082f075d5b9990
import com.example.TeamProject.service.MedicalReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/medicalReport/")
public class MedicalReportController {
    @Autowired
    private MedicalReportService medicalReportService;

<<<<<<< HEAD
    @PostMapping("create")
    public ResponseEntity<MedicalReportEntity> addMedicalReport(@RequestBody MedicalReportEntity medicalReport){
=======
    @Autowired
    public MedicalReportController(MedicalReportService medicalReportService){
        this.medicalReportService = medicalReportService;
    }

    @PostMapping
    public ResponseEntity<?> addMedicalReport(@RequestBody MedicalReport medicalReport){
>>>>>>> 70a22886414510687786d1c622082f075d5b9990
        medicalReportService.addMedicalReport(medicalReport);
        return ResponseEntity.ok().build();
    }

    @GetMapping("{id}")
    public ResponseEntity<MedicalReportEntity> getMedicalReport(@PathVariable("id") Long id) {
        if (medicalReportService.getMedicalReport(id).isPresent()) {
            return ResponseEntity.ok(medicalReportService.getMedicalReport(id).get());
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
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
}