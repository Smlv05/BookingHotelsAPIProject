package org.example.BookingHotelsAPIProject.repository;

import org.example.BookingHotelsAPIProject.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {

}
