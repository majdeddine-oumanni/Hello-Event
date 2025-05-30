package com.api.backend.service;

import com.api.backend.DTO.BookingDTO;
import com.api.backend.mapper.BookingMapper;
import com.api.backend.model.Booking;
import com.api.backend.repositories.BookingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {
    private final BookingRepository bookingRepository;
    private final BookingMapper bookingMapper;

    public BookingService(BookingRepository bookingRepository, BookingMapper bookingMapper) {
        this.bookingRepository = bookingRepository;
        this.bookingMapper = bookingMapper;
    }

    public List<BookingDTO> bookingDTOS(Long id){
        List<BookingDTO> bookingDTOS = bookingMapper.toDTOs(bookingRepository.findByEvent_Id(id));
        return bookingDTOS;
    }
}
