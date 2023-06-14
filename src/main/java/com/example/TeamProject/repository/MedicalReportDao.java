package com.example.TeamProject.repository;

import com.example.TeamProject.entity.MedicalReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicalReportDao extends JpaRepository<MedicalReport, Long> {
}
