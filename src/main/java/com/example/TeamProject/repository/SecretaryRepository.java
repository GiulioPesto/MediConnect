package com.example.TeamProject.repository;

import com.example.TeamProject.entity.SecretaryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecretaryRepository extends JpaRepository<SecretaryEntity, Long> {
}
