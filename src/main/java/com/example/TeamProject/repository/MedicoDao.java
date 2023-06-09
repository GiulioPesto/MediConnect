package com.example.TeamProject.repository;

import com.example.TeamProject.model.Medico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicoDao extends JpaRepository<Medico, Long> {
}