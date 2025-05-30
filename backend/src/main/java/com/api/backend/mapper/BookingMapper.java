package com.api.backend.mapper;

import com.api.backend.DTO.BookingDTO;
import com.api.backend.model.Booking;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BookingMapper {
    Booking toEntity(BookingDTO dto);
    BookingDTO toDTO(Booking booking);
    List<BookingDTO> toDTOs(List<Booking> bookings);
}
