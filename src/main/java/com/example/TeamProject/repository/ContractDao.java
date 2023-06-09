package com.example.TeamProject.repository;

import com.example.TeamProject.model.Contract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractDao extends JpaRepository<Contract, Long> {
}
