package com.example.demo.service;

import com.example.demo.dto.SportEventDTO;
import com.example.demo.model.SportEvent;

import java.util.List;

public interface SportEventService {
    List<SportEvent> findAll();

    SportEventDTO findById(int id);

    void createSportEvent(SportEventDTO sportEventDTO);

    void updateSportField(int id, SportEventDTO sportEventDTO);

    void deleteSportEvent(int id);
}
