package com.api.backend.controller;

import com.api.backend.DTO.EventDTO;
import com.api.backend.model.Event;
import com.api.backend.service.EventService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/event")
public class EventController {
    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }


    @PostMapping("/add")
    public EventDTO addEvent(@RequestBody EventDTO dto){
        return eventService.saveEvent(dto);
    }

    @GetMapping("/getAll")
    public List<EventDTO> findAllEvents(){
        return eventService.getAllEvents();
    }

    @PutMapping("/update/{id}")
    public EventDTO update(@RequestBody EventDTO dto, @PathVariable Long id){
        return eventService.updateEvent(dto, id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        eventService.deleteEvent(id);
    }
}
