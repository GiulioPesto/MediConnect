package com.example.TeamProject.service;

<<<<<<< HEAD
import com.example.TeamProject.entity.BookingEntity;
import com.example.TeamProject.repository.BookingRepository;
=======
import com.example.TeamProject.entity.Booking;
import com.example.TeamProject.repository.BookingDao;
>>>>>>> 70a22886414510687786d1c622082f075d5b9990
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.openmbean.InvalidKeyException;
import java.util.Optional;

@Service
public class BookingService {
    @Autowired
    public BookingRepository bookingRepository;

    public void addBooking(BookingEntity booking){
        bookingRepository.save(booking);
    }

    public Optional<BookingEntity> getBooking(Long bookingId){
        return bookingRepository.findById(bookingId);
    }

    public void updateBooking(Long bookingId, BookingEntity updatedBooking){
        BookingEntity bookingRepo = bookingRepository.findById(bookingId).orElseThrow(InvalidKeyException::new);
        bookingRepo.setTime(updatedBooking.getTime());
        bookingRepo.setMedicalOffice(updatedBooking.getMedicalOffice());
        bookingRepo.setReason(updatedBooking.getReason());
        bookingRepository.save(bookingRepo);
    }

    public void deleteBooking(Long bookingId){
        bookingRepository.deleteById(bookingId);
    }
}