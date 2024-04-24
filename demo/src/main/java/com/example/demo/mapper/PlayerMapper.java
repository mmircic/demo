package com.example.demo.mapper;

import com.example.demo.dto.PlayerDTO;
import com.example.demo.model.Player;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PlayerMapper {
    Player playerDTOToPlayer(PlayerDTO playerDTO);
    PlayerDTO playerToPlayerDTO(Player player);
    List<PlayerDTO> playerListToPlayerDTOList(List<Player> playerList);
}
