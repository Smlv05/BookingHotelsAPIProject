package org.example.BookingHotelsAPIProject.service;

import org.example.BookingHotelsAPIProject.model.Booking;
import org.example.BookingHotelsAPIProject.repository.BookingRepository;
import org.springframework.stereotype.Service;

@Service
public class BookingService {

    private final BookingRepository bookingRepository;

    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public Booking saveBooking(Booking booking) {
        return bookingRepository.save(booking);
    }
}
