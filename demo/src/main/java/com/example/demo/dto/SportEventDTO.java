package com.example.demo.dto;

import com.example.demo.model.SportField;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class SportEventDTO {
    private String name;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private SportField sportField;

    public SportEventDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public SportField getSportField() {
        return sportField;
    }

    public void setSportField(SportField sportField) {
        this.sportField = sportField;
    }
}
