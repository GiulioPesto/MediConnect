package com.example.TeamProject.repository;

import com.example.TeamProject.entity.Secretary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecretaryDao extends JpaRepository<Secretary, Long> {
}
