package com.example.demo.repository;

import com.example.demo.model.SportField;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SportFieldRepository extends JpaRepository<SportField, Integer> {
}
