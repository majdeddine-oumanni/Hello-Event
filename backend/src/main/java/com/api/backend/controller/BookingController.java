package com.api.backend.controller;

import com.api.backend.DTO.BookingDTO;
import com.api.backend.model.Booking;
import com.api.backend.service.BookingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/booking")
public class BookingController {
    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping("/bookEvent")
    public BookingDTO booking(@RequestBody BookingDTO dto){
        return bookingService.bookingIntoEvent(dto);
    }

    @GetMapping("/list/{id}")
    public List<BookingDTO> bookingList(@PathVariable Long id){
        return bookingService.getAllbookings(id);
    }


}
