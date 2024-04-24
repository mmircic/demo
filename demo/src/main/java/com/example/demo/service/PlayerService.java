package com.example.demo.service;

import com.example.demo.dto.PlayerDTO;
import com.example.demo.model.Player;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PlayerService {
    List<Player> findAll();

    void createPlayer(PlayerDTO player);
    void updatePlayer(int id, PlayerDTO player);

    void deletePlayer(int id);

    PlayerDTO findById(int id);
}
