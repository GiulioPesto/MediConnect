package com.example.TeamProject.repository;

import com.example.TeamProject.model.Segretari;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SegretariDao extends JpaRepository<Segretari, Long> {
}
