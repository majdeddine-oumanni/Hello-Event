package com.api.backend.controller;

import com.api.backend.DTO.BookingDTO;
import com.api.backend.model.Booking;
import com.api.backend.service.BookingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookingController {
    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @GetMapping("/{id}")
    public List<BookingDTO> bookingDTOS(@PathVariable Long id){
        return bookingService.bookingDTOS(id);
    }
}
