package com.example.TeamProject.controller;

import com.example.TeamProject.model.Booking;
import com.example.TeamProject.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/booking/")
public class BookingController {
    private BookingService bookingService;

    @Autowired
    public BookingController(BookingService bookingService){
        this.bookingService = bookingService;
    }

    @PostMapping
    public ResponseEntity<?> registerBooking(@RequestBody Booking booking){
        bookingService.addBooking(booking);
        return ResponseEntity.ok().build();
    }

    @GetMapping("{id}")
    public ResponseEntity<Booking> viewBooking(@PathVariable("id") Long bookingId){
        return ResponseEntity.ok(bookingService.getBooking(bookingId).get());
    }

    @PutMapping("{id}")
    public ResponseEntity<?> updateBooking(@PathVariable("id") Long bookingId,@RequestBody Booking booking){
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteBooking(@PathVariable("id") Long bookingId){
        bookingService.deleteBooking(bookingId);
        return ResponseEntity.ok().build();
    }
}