package com.example.demo.mapper;

import com.example.demo.dto.SportFieldDTO;
import com.example.demo.model.SportField;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SportFieldMapper {
    SportFieldDTO mapSportFieldToSportFieldDTO(SportField sportField);
    SportField mapSportFieldDTOToSportField(SportFieldDTO sportField);
}
