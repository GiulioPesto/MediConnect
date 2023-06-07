package com.example.TeamProject.repository;

import com.example.TeamProject.model.Contratto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContrattoDao extends JpaRepository<Contratto, Long> {
}
