package com.klef.fsad.exam.service;

import com.klef.fsad.exam.model.Booking;
import com.klef.fsad.exam.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    // Add Booking
    public String addBooking(Booking booking) {
        if (booking.getBookingId() == null) {
            return "Booking ID must not be null!";
        }
        if (bookingRepository.existsById(booking.getBookingId())) {
            return "Booking with ID " + booking.getBookingId() + " already exists!";
        }
        bookingRepository.save(booking);
        return "Booking Added Successfully with ID: " + booking.getBookingId();
    }

    // Delete Booking
    public String deleteBooking(Long bookingId) {
        if (!bookingRepository.existsById(bookingId)) {
            return "Booking with ID " + bookingId + " not found!";
        }
        bookingRepository.deleteById(bookingId);
        return "Booking Deleted Successfully with ID: " + bookingId;
    }
}
