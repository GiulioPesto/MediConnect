package com.example.TeamProject.controller;
import com.example.TeamProject.entity.BookingEntity;
import com.example.TeamProject.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

// TODO Mettere i service giusti nei controller adeguati (chi crea cosa)
@RestController
@RequestMapping("/api/booking/")
public class BookingController {
    @Autowired
    private BookingService bookingService;

    @PostMapping
    public ResponseEntity<BookingEntity> registerBooking(@RequestBody BookingEntity booking){
        bookingService.addBooking(booking);
        return ResponseEntity.ok().build();
    }

    @GetMapping("{id}")
    public ResponseEntity<BookingEntity> viewBooking(@PathVariable("id") Long bookingId){
        if (bookingService.getBooking(bookingId).isPresent()) {
            return ResponseEntity.ok(bookingService.getBooking(bookingId).get());
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("getAll")
    public ResponseEntity<Collection<BookingEntity>> viewAllBookings() {
        return ResponseEntity.ok(bookingService.getAllBookings());
    }


    @PutMapping("{id}")
    public ResponseEntity<BookingEntity> updateBooking(@PathVariable("id") Long bookingId, @RequestBody BookingEntity booking){
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("{id}")
    public ResponseEntity<BookingEntity> deleteBooking(@PathVariable("id") Long bookingId){
        bookingService.deleteBooking(bookingId);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("deleteAll")
    public ResponseEntity<BookingEntity> deleteAllBookings() {
        bookingService.deleteAllBookings();
        return ResponseEntity.ok().build();
    }
}