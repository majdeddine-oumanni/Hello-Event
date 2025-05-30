package com.api.backend.repositories;

import com.api.backend.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {

    @Query(value = "SELECT Booking FROM Booking WHERE Booking.event.id = ?", nativeQuery = true)
    List<Booking> findByEvent_Id(Long id);
}
