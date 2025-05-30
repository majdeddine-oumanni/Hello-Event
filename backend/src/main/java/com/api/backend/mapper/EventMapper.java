package com.api.backend.mapper;

import com.api.backend.DTO.EventDTO;
import com.api.backend.model.Event;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EventMapper {
    Event toEntity(EventDTO dto);
    EventDTO toDTO(Event event);
    List<EventDTO> toDTOs(List<Event> eventList);
}

