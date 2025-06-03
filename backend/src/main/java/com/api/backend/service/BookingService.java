package com.api.backend.service;

import com.api.backend.DTO.BookingDTO;
import com.api.backend.mapper.BookingMapper;
import com.api.backend.model.Booking;
import com.api.backend.model.Event;
import com.api.backend.model.User;
import com.api.backend.repositories.BookingRepository;
import com.api.backend.repositories.EventRepository;
import com.api.backend.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class BookingService {
    private final BookingRepository bookingRepository;
    private final BookingMapper bookingMapper;
    private final UserRepository userRepository;
    private final EventRepository eventRepository;

    public BookingService(BookingRepository bookingRepository, BookingMapper bookingMapper, UserRepository userRepository, EventRepository eventRepository) {
        this.bookingRepository = bookingRepository;
        this.bookingMapper = bookingMapper;
        this.userRepository = userRepository;
        this.eventRepository = eventRepository;
    }


    public BookingDTO bookingIntoEvent(BookingDTO dto){
        Event event = eventRepository.findById(dto.getEvent_id()).
                orElseThrow(() -> new RuntimeException("event not found"));
        User user = userRepository.findById(dto.getUser_id()).
                orElseThrow(()-> new RuntimeException("user not found"));

        Booking booking = new Booking();
        booking.setEvent(event);
        booking.setUser(user);
        booking.setBookingDate(LocalDate.from(LocalDateTime.now()));
        Booking savedBooking = bookingRepository.save(booking);

        return bookingMapper.toDTO(savedBooking);
    }

    public List<BookingDTO> getAllbookings(Long user_id){
        List<Booking> bookings = bookingRepository.findByUserId(user_id);
        return bookingMapper.toDTOs(bookings);
    }
}
