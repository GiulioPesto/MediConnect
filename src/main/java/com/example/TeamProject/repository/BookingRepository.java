package com.example.TeamProject.repository;

<<<<<<< HEAD:src/main/java/com/example/TeamProject/repository/BookingRepository.java
import com.example.TeamProject.entity.BookingEntity;
=======
import com.example.TeamProject.entity.Doctor;
>>>>>>> 70a22886414510687786d1c622082f075d5b9990:src/main/java/com/example/TeamProject/repository/DoctorDao.java
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<BookingEntity,Long> {

}
