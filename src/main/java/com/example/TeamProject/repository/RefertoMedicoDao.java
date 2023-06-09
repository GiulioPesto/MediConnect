package com.example.TeamProject.repository;

import com.example.TeamProject.model.RefertoMedico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RefertoMedicoDao extends JpaRepository<RefertoMedico, Long> {
}
