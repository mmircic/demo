package com.example.demo.controller;

import com.example.demo.dto.SportFieldDTO;
import com.example.demo.model.SportField;
import com.example.demo.service.SportFieldService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SportFieldController {
    private final SportFieldService sportFieldService;

    public SportFieldController(SportFieldService sportFieldService) {
        this.sportFieldService = sportFieldService;
    }

    @GetMapping("/sportFields")
    public List<SportField> getAllSportFields() {
        return sportFieldService.findAll();
    }

    @GetMapping("/sportField{id}")
    public SportFieldDTO getSportFieldById(@PathVariable int id) {
        return sportFieldService.findById(id);
    }

    @PostMapping("/sportField")
    public void createSportField(@RequestBody SportFieldDTO sportFieldDTO) {
        sportFieldService.createSportField(sportFieldDTO);
    }

    @PutMapping("/sportField/{id}")
    public void updateSportField(@PathVariable int id, @RequestBody SportFieldDTO sportFieldDTO) {
        sportFieldService.updateSportField(id, sportFieldDTO);
    }

    @DeleteMapping("/sportField/{id}")
    public void deleteSportField(@PathVariable int id) {
        sportFieldService.deleteSportField(id);
    }
}
