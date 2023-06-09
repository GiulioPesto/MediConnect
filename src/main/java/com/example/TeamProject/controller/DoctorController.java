package com.example.TeamProject.controller;

import com.example.TeamProject.model.Doctor;
import com.example.TeamProject.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/doctor/")
public class DoctorController {
    private DoctorService doctorService;

    @Autowired
    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @PostMapping
    public ResponseEntity<?> registerDoctor(@RequestBody Doctor doctor) {
        doctorService.addDoctor(doctor);
        return ResponseEntity.ok().build();
    }

    @GetMapping("{id}")
    public ResponseEntity<Doctor> viewDoctor(@PathVariable("id") Long doctorId) {
        return ResponseEntity.ok(doctorService.getDoctor(doctorId).get());
    }

    @PutMapping("{id}")
    public ResponseEntity<?> updateDoctor(@PathVariable("id") Long doctorId,
                                          @RequestBody Doctor doctor) {
        doctorService.updateDoctor(doctorId, doctor);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> removeDoctor(@PathVariable("id") Long doctorId) {
        doctorService.deleteDoctor(doctorId);
        return ResponseEntity.ok().build();
    }
}