package com.example.TeamProject.repository;

import com.example.TeamProject.model.Paziente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PazienteDao extends JpaRepository<Paziente, Long> {
}
