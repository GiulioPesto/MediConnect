package com.example.TeamProject.service;

import com.example.TeamProject.entity.Doctor;
import com.example.TeamProject.repository.DoctorDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.openmbean.InvalidKeyException;
import java.util.Optional;

@Service
public class DoctorService {
    private DoctorDao doctorDao;

    @Autowired
    public DoctorService(DoctorDao doctorDao) {
        this.doctorDao = doctorDao;
    }

    public void addDoctor(Doctor doctor) {
        doctorDao.save(doctor);
    }

    public Optional<Doctor> getDoctor(Long doctorId) {
        return doctorDao.findById(doctorId);
    }

    public void updateDoctor(Long doctorId, Doctor updatedDoctor) {
        Doctor doctorRepo = doctorDao.findById(doctorId).orElseThrow(InvalidKeyException::new);
        doctorRepo.setFirstName(updatedDoctor.getFirstName());
        doctorRepo.setLastName(updatedDoctor.getLastName());
        doctorRepo.setTaxCode(updatedDoctor.getTaxCode());
        doctorRepo.setPersonalTelephone(updatedDoctor.getPersonalTelephone());
        doctorRepo.setSpecialization(updatedDoctor.getSpecialization());
        doctorRepo.setOrderRegistration(updatedDoctor.getOrderRegistration());
        doctorDao.save(doctorRepo);
    }

    public void deleteDoctor(Long doctorId) {
        doctorDao.deleteById(doctorId);
    }
}