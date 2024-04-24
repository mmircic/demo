package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "sportField")
public class SportField {
    @Id
    @JsonProperty(value = "Id")
    @Column(name = "id", columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @JsonProperty(value = "Name")
    @Column(name = "name")
    private String name;

    @JsonProperty(value = "Location")
    @Column(name = "location")
    private String location;

    @OneToMany(mappedBy = "sportField", cascade = CascadeType.ALL)
    private List<SportEvent> sportEvents;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<SportEvent> getSportEvents() {
        return sportEvents;
    }

    public void setSportEvents(List<SportEvent> sportEvents) {
        this.sportEvents = sportEvents;
    }
}
