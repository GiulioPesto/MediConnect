package com.example.TeamProject.repository;

import com.example.TeamProject.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientDao extends JpaRepository<Patient, Long> {
}
