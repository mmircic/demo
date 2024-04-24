package com.example.demo.service;

import com.example.demo.dto.PlayerDTO;
import com.example.demo.mapper.PlayerMapper;
import com.example.demo.model.Player;
import com.example.demo.repository.PlayerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerServiceImpl implements PlayerService{
    private final PlayerRepository playerRepository;
    private final PlayerMapper playerMapper;

    public PlayerServiceImpl(PlayerRepository playerRepository, PlayerMapper playerMapper) {
        this.playerRepository = playerRepository;
        this.playerMapper = playerMapper;
    }

    @Override
    public List<Player> findAll() {
        return playerRepository.findAll();
    }

    @Override
    public void createPlayer(PlayerDTO player) {
        var playerEntity = playerMapper.playerDTOToPlayer(player);
        playerRepository.save(playerEntity);
    }

    @Override
    public void updatePlayer(int id, PlayerDTO player) {
        var playerEntity = playerRepository.findById(id).get();
        playerEntity.setFirstName(player.getFirstName());
        playerEntity.setLastName(player.getLastName());
        playerRepository.save(playerEntity);
    }

    @Override
    public void deletePlayer(int id) {
        playerRepository.deleteById(id);
    }

    @Override
    public PlayerDTO findById(int id) {
        var dbPlayer = playerRepository.findById(id).get();
        return playerMapper.playerToPlayerDTO(dbPlayer);
    }
}
