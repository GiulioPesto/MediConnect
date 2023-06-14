package com.example.TeamProject.repository;

<<<<<<< HEAD:src/main/java/com/example/TeamProject/repository/PatientRepository.java
import com.example.TeamProject.entity.PatientEntity;
=======
import com.example.TeamProject.entity.Contract;
>>>>>>> 70a22886414510687786d1c622082f075d5b9990:src/main/java/com/example/TeamProject/repository/ContractDao.java
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<PatientEntity, Long> {
}
