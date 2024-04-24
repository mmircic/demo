package com.example.demo.mapper;

import com.example.demo.dto.SportEventDTO;
import com.example.demo.dto.SportFieldDTO;
import com.example.demo.model.SportEvent;
import com.example.demo.model.SportField;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SportEventMapper {
    SportEventDTO mapSportEventToSportEventDTO(SportEvent sportEvent);
    SportEvent mapSportEventDTOToSportEvent(SportEventDTO sportEvent);
}
