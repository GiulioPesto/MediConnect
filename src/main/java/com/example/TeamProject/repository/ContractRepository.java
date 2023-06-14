package com.example.TeamProject.repository;

<<<<<<< HEAD:src/main/java/com/example/TeamProject/repository/ContractRepository.java
import com.example.TeamProject.entity.ContractEntity;
=======
import com.example.TeamProject.entity.MedicalOffice;
>>>>>>> 70a22886414510687786d1c622082f075d5b9990:src/main/java/com/example/TeamProject/repository/MedicalOfficeDao.java
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractRepository extends JpaRepository<ContractEntity, Long> {
}
