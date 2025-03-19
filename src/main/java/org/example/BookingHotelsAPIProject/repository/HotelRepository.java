package org.example.BookingHotelsAPIProject.repository;

import org.example.BookingHotelsAPIProject.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel, Long> {

}
