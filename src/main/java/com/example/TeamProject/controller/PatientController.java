package com.example.TeamProject.controller;

import com.example.TeamProject.entity.Patient;
import com.example.TeamProject.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/patient/")
public class PatientController {
    private PatientService patientService;

    @Autowired
    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @PostMapping
    public ResponseEntity<?> registerPatient(@RequestBody Patient patient) {
        patientService.addPatient(patient);
        return ResponseEntity.ok().build();
    }

    @GetMapping("{id}")
    public ResponseEntity<Patient> viewPatient(@PathVariable("id") Long patientId) {
        return ResponseEntity.ok(patientService.getPatient(patientId).get());
    }

    @PutMapping("{id}")
    public ResponseEntity<?> updatePatient(@PathVariable("id") Long patientId,
                                           @RequestBody Patient patient) {
        patientService.updatePatient(patientId, patient);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> removePatient(@PathVariable("id") Long patientId) {
        patientService.deletePatient(patientId);
        return ResponseEntity.ok().build();
    }
}