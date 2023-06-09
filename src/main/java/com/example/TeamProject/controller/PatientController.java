package com.example.TeamProject.controller;
import com.example.TeamProject.entity.BookingEntity;
import com.example.TeamProject.entity.PatientEntity;
import com.example.TeamProject.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping(value = "/api/patient/")
public class PatientController {
    @Autowired
    private PatientService patientService;

    @PostMapping
    public ResponseEntity<PatientEntity> registerPatient(@RequestBody PatientEntity patient) {
        patientService.addPatient(patient);
        return ResponseEntity.ok().build();
    }

    @GetMapping("{id}")
    public ResponseEntity<PatientEntity> viewPatient(@PathVariable("id") Long patientId) {
        if (patientService.getPatient(patientId).isPresent()) {
            return ResponseEntity.ok(patientService.getPatient(patientId).get());
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("getAll")
    public ResponseEntity<Collection<PatientEntity>> viewAllPatients() {
        return ResponseEntity.ok(patientService.getAllPatients());
    }

    @GetMapping("test")
    public ResponseEntity<String> test() {
        patientService.test();
        return ResponseEntity.ok("test");
    }

    @PutMapping("{id}")
    public ResponseEntity<PatientEntity> updatePatient(@PathVariable("id") Long patientId,
                                                       @RequestBody PatientEntity patient) {
        patientService.updatePatient(patientId, patient);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("{id}")
    public ResponseEntity<PatientEntity> removePatient(@PathVariable("id") Long patientId) {
        patientService.deletePatient(patientId);
        return ResponseEntity.ok().build();
    }

    @PutMapping("reactivate/{id}")
    public ResponseEntity<PatientEntity> reactivatePatient(@PathVariable("id") Long patientId) {
        patientService.reactivatePatient(patientId);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("deleteAll")
    public ResponseEntity<PatientEntity> deleteAllPatients() {
        patientService.deleteAllPatients();
        return ResponseEntity.ok().build();
    }
}