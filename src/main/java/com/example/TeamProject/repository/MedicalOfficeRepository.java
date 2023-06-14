package com.example.TeamProject.repository;

import com.example.TeamProject.entity.MedicalOfficeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicalOfficeRepository extends JpaRepository<MedicalOfficeEntity, Long> {
}
