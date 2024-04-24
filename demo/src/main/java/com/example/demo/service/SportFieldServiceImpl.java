package com.example.demo.service;

import com.example.demo.dto.SportFieldDTO;
import com.example.demo.mapper.SportFieldMapper;
import com.example.demo.model.SportField;
import com.example.demo.repository.SportFieldRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SportFieldServiceImpl implements SportFieldService {
    private final SportFieldRepository sportFieldRepository;
    private final SportFieldMapper sportFieldMapper;

    public SportFieldServiceImpl(SportFieldRepository sportFieldRepository, SportFieldMapper sportFieldMapper) {
        this.sportFieldRepository = sportFieldRepository;
        this.sportFieldMapper = sportFieldMapper;
    }


    @Override
    public List<SportField> findAll() {
        return sportFieldRepository.findAll();
    }

    @Override
    public SportFieldDTO findById(int id) {
        var dbSportField = sportFieldRepository.findById(id).get();
        return sportFieldMapper.mapSportFieldToSportFieldDTO(dbSportField);
    }

    @Override
    public void createSportField(SportFieldDTO sportFieldDTO) {
        var sportFieldEntity = sportFieldMapper.mapSportFieldDTOToSportField(sportFieldDTO);
        sportFieldRepository.save(sportFieldEntity);
    }

    @Override
    public void updateSportField(int id, SportFieldDTO sportFieldDTO) {
        var sportFieldEntity = sportFieldRepository.findById(id).get();
        sportFieldEntity.setName(sportFieldDTO.getName());
        sportFieldEntity.setLocation(sportFieldDTO.getLocation());
        sportFieldRepository.save(sportFieldEntity);
    }

    @Override
    public void deleteSportField(int id) {
        sportFieldRepository.deleteById(id);
    }
}
