package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "sportEvent")
public class SportEvent {

    @Id
    @JsonProperty(value = "Id")
    @Column(name = "id", columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @JsonProperty(value = "Name")
    @Column(name = "name")
    private String name;

    @Column(nullable = false)
    private LocalDateTime startTime;

    @Column(nullable = false)
    private LocalDateTime endTime;

    @ManyToOne
    @JoinColumn(name = "sportFieldId", nullable = false)
    private SportField sportField;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
