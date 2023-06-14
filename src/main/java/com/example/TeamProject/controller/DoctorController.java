package com.example.TeamProject.controller;

<<<<<<< HEAD
import com.example.TeamProject.entity.DoctorEntity;
=======
import com.example.TeamProject.entity.Doctor;
>>>>>>> 70a22886414510687786d1c622082f075d5b9990
import com.example.TeamProject.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/doctor/")
public class DoctorController {
    @Autowired
    private DoctorService doctorService;

    @PostMapping
    public ResponseEntity<DoctorEntity> registerDoctor(@RequestBody DoctorEntity doctor) {
        doctorService.addDoctor(doctor);
        return ResponseEntity.ok().build();
    }

    @GetMapping("{id}")
    public ResponseEntity<DoctorEntity> viewDoctor(@PathVariable("id") Long doctorId) {
        if (doctorService.getDoctor(doctorId).isPresent()) {
        return ResponseEntity.ok(doctorService.getDoctor(doctorId).get());
        } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
    }

    @PutMapping("{id}")
    public ResponseEntity<DoctorEntity> updateDoctor(@PathVariable("id") Long doctorId,
                                                     @RequestBody DoctorEntity doctor) {
        doctorService.updateDoctor(doctorId, doctor);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("{id}")
    public ResponseEntity<DoctorEntity> removeDoctor(@PathVariable("id") Long doctorId) {
        doctorService.deleteDoctor(doctorId);
        return ResponseEntity.ok().build();
    }
}