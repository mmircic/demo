package com.example.demo.controller;

import com.example.demo.dto.SportEventDTO;
import com.example.demo.dto.SportFieldDTO;
import com.example.demo.model.SportEvent;
import com.example.demo.service.SportEventService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SportEventController {
    private final SportEventService sportEventService;

    public SportEventController(SportEventService sportEventService) {
        this.sportEventService = sportEventService;
    }

    @GetMapping("/sportEvents")
    public List<SportEvent> getAllSportEvents() {
        return sportEventService.findAll();
    }

    @GetMapping("/sportEvent/{id}")
    public SportEventDTO getSportEvent(@PathVariable int id) {
        return sportEventService.findById(id);
    }

    @PostMapping("/sportEvent")
    public void createSportEvent(@RequestBody SportEventDTO sportEventDTO) {
        sportEventService.createSportEvent(sportEventDTO);
    }

    @PutMapping("/sportEvent/{id}")
    public void updateSportEvent(@PathVariable int id, @RequestBody SportEventDTO sportEventDTO) {
        sportEventService.updateSportField(id, sportEventDTO);
    }

    @DeleteMapping("/sportEvent/{id}")
    public void deleteSportEvent(@PathVariable int id) {
        sportEventService.deleteSportEvent(id);
    }
}
