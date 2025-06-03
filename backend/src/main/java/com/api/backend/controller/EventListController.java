package com.api.backend.controller;

import com.api.backend.DTO.EventDTO;
import com.api.backend.service.EventService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/eventList")
public class EventListController {
    private final EventService eventService;

    public EventListController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping
    public List<EventDTO> getEventList(){
        return eventService.getAllEvents();
    }
}
