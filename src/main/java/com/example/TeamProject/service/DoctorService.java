package com.example.TeamProject.service;

<<<<<<< HEAD
import com.example.TeamProject.entity.DoctorEntity;
import com.example.TeamProject.repository.DoctorRepository;
=======
import com.example.TeamProject.entity.Doctor;
import com.example.TeamProject.repository.DoctorDao;
>>>>>>> 70a22886414510687786d1c622082f075d5b9990
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.openmbean.InvalidKeyException;
import java.util.Optional;

@Service
public class DoctorService {
    @Autowired
    private DoctorRepository doctorRepository;

    public void addDoctor(DoctorEntity doctor) {
        doctorRepository.save(doctor);
    }

    public Optional<DoctorEntity> getDoctor(Long doctorId) {
        return doctorRepository.findById(doctorId);
    }

    public void updateDoctor(Long doctorId, DoctorEntity updatedDoctor) {
        DoctorEntity doctorRepo = doctorRepository.findById(doctorId).orElseThrow(InvalidKeyException::new);
        doctorRepo.setFirstName(updatedDoctor.getFirstName());
        doctorRepo.setLastName(updatedDoctor.getLastName());
        doctorRepo.setTaxCode(updatedDoctor.getTaxCode());
        doctorRepo.setPersonalTelephone(updatedDoctor.getPersonalTelephone());
        doctorRepo.setSpecialization(updatedDoctor.getSpecialization());
        doctorRepo.setOrderRegistration(updatedDoctor.getOrderRegistration());
        doctorRepository.save(doctorRepo);
    }

    public void deleteDoctor(Long doctorId) {
        doctorRepository.deleteById(doctorId);
    }
}