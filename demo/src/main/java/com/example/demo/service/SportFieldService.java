package com.example.demo.service;

import com.example.demo.dto.SportFieldDTO;
import com.example.demo.model.SportField;

import java.util.List;

public interface SportFieldService {
    List<SportField> findAll();

    SportFieldDTO findById(int id);

    void createSportField(SportFieldDTO sportFieldDTO);

    void updateSportField(int id, SportFieldDTO sportFieldDTO);

    void deleteSportField(int id);
}
