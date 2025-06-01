package com.api.backend.service;

import com.api.backend.DTO.EventDTO;
import com.api.backend.mapper.EventMapper;
import com.api.backend.model.Event;
import com.api.backend.repositories.EventRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {
    private final EventMapper eventMapper;
    private final EventRepository eventRepository;

    public EventService(EventMapper eventMapper, EventRepository eventRepository) {
        this.eventMapper = eventMapper;
        this.eventRepository = eventRepository;
    }

    public EventDTO saveEvent(EventDTO dto){
        Event event = eventMapper.toEntity(dto);
        Event savedEvent = eventRepository.save(event);
        return eventMapper.toDTO(savedEvent);
    }

    public List<EventDTO> getAllEvents(){
        List<EventDTO> eventDTOList = eventMapper.toDTOs(eventRepository.findAll());
        return eventDTOList;
    }
}
