package com.example.demo.controller;

import com.example.demo.dto.PlayerDTO;
import com.example.demo.model.Player;
import com.example.demo.service.PlayerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlayerController {
    private final PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping("/players")
    public List<Player> getAllPlayers() {
        return playerService.findAll();
    }

    @GetMapping("/player/{id}")
    public PlayerDTO getPlayerById(@PathVariable int id) {
        return playerService.findById(id);
    }

    @PostMapping("/player")
    public void createPlayer(@RequestBody PlayerDTO player) {
        playerService.createPlayer(player);
    }

    @PutMapping("/player/{id}")
    public void updatePlayer(@PathVariable int id, @RequestBody PlayerDTO player) {
        playerService.updatePlayer(id, player);
    }

    @DeleteMapping("player/{id}")
    public void deletePlayer(@PathVariable int id) {
        playerService.deletePlayer(id);
    }
}
