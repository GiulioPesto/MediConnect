package com.example.TeamProject.service;

import com.example.TeamProject.model.Booking;
import com.example.TeamProject.repository.BookingDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.openmbean.InvalidKeyException;
import java.util.Optional;

@Service
public class BookingService {
    public BookingDao bookingDao;

    @Autowired
    public BookingService(BookingDao bookingDao){
        this.bookingDao = bookingDao;
    }

    public void addBooking(Booking booking){
        bookingDao.save(booking);
    }

    public Optional<Booking> getBooking(Long bookingId){
        return bookingDao.findById(bookingId);
    }

    public void updateBooking(Long bookingId, Booking updatedBooking){
        Booking bookingRepo = bookingDao.findById(bookingId).orElseThrow(InvalidKeyException::new);
        bookingRepo.setTime(updatedBooking.getTime());
        bookingRepo.setMedicalOffice(updatedBooking.getMedicalOffice());
        bookingRepo.setReason(updatedBooking.getReason());
        bookingDao.save(bookingRepo);
    }

    public void deleteBooking(Long bookingId){
        bookingDao.deleteById(bookingId);
    }
}