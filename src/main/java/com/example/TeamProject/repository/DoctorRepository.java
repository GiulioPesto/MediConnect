package com.example.TeamProject.repository;

<<<<<<< HEAD:src/main/java/com/example/TeamProject/repository/DoctorRepository.java
import com.example.TeamProject.entity.DoctorEntity;
=======
import com.example.TeamProject.entity.Booking;
>>>>>>> 70a22886414510687786d1c622082f075d5b9990:src/main/java/com/example/TeamProject/repository/BookingDao.java
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<DoctorEntity, Long> {
}
