package com.klef.fsad.exam.controller;

import com.klef.fsad.exam.model.Booking;
import com.klef.fsad.exam.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/booking")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    // POST - Add Booking
    @PostMapping("/add")
    public ResponseEntity<String> addBooking(@RequestBody Booking booking) {
        String response = bookingService.addBooking(booking);
        return ResponseEntity.ok(response);
    }

    // DELETE - Delete Booking by ID
    @DeleteMapping("/delete/{bookingId}")
    public ResponseEntity<String> deleteBooking(@PathVariable Long bookingId) {
        String response = bookingService.deleteBooking(bookingId);
        return ResponseEntity.ok(response);
    }
}
