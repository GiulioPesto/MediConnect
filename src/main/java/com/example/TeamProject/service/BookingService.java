package com.example.TeamProject.service;

import com.example.TeamProject.entity.BookingEntity;
import com.example.TeamProject.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.openmbean.InvalidKeyException;
import java.util.Collection;
import java.util.Optional;

@Service
public class BookingService {
    @Autowired
    private BookingRepository bookingRepository;
    @Autowired
    private DoctorRepository doctorRepository;
    @Autowired
    private PatientRepository patientRepository;
    @Autowired
    private SecretaryRepository secretaryRepository;

    public void addBooking(BookingEntity booking, Long patient_id, Long doctor_id, Long secretary_id){
        booking.setDoctor(doctorRepository.findById(doctor_id).orElseThrow());
        booking.setPatient(patientRepository.findById(patient_id).orElseThrow());
        booking.setSecretary(secretaryRepository.findById(secretary_id).orElseThrow());
        bookingRepository.save(booking);
    }

    public Optional<BookingEntity> getBooking(Long bookingId){
        return bookingRepository.findById(bookingId);
    }

    public Collection<BookingEntity> getAllBookings() {
        return bookingRepository.findAll();
    }

    public BookingEntity updateBooking(Long bookingId, BookingEntity updatedBooking){
        BookingEntity bookingRepo = bookingRepository.findById(bookingId).orElseThrow(InvalidKeyException::new);
        bookingRepo.setTime(updatedBooking.getTime());
        bookingRepo.setMedicalOffice(updatedBooking.getMedicalOffice());
        bookingRepo.setReason(updatedBooking.getReason());
        bookingRepository.save(bookingRepo);
        return bookingRepo;
    }

    public void deleteBooking(Long bookingId){
        bookingRepository.deleteById(bookingId);
    }

    public void deleteAllBookings() { bookingRepository.deleteAll(); }
}