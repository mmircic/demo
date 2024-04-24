package com.example.demo.model;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table(name = "player")
public class Player {
    @Id
    @JsonProperty(value = "Id")
    @Column(name = "id", columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @JsonProperty(value = "FirstName")
    @Column(name = "firstname")
    private String firstName;

    @JsonProperty(value = "LastName")
    @Column(name = "lastname")
    private String lastName;

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
