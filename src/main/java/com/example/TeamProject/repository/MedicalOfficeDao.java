package com.example.TeamProject.repository;

import com.example.TeamProject.entity.MedicalOffice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicalOfficeDao extends JpaRepository<MedicalOffice, Long> {
}
