package com.example.demo.repository;

import com.example.demo.model.SportEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SportEventRepository extends JpaRepository<SportEvent, Integer> {
}
