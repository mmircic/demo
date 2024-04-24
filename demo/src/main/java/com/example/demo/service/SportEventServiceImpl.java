package com.example.demo.service;

import com.example.demo.dto.SportEventDTO;
import com.example.demo.mapper.SportEventMapper;
import com.example.demo.model.SportEvent;
import com.example.demo.repository.SportEventRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SportEventServiceImpl implements SportEventService {
    private final SportEventRepository sportEventRepository;
    private final SportEventMapper sportEventMapper;

    public SportEventServiceImpl(SportEventRepository sportEventRepository, SportEventMapper sportEventMapper) {
        this.sportEventRepository = sportEventRepository;
        this.sportEventMapper = sportEventMapper;
    }

    @Override
    public List<SportEvent> findAll() {
        return sportEventRepository.findAll();
    }

    @Override
    public SportEventDTO findById(int id) {
        var dbSportEvent = sportEventRepository.findById(id).get();
        return sportEventMapper.mapSportEventToSportEventDTO(dbSportEvent);
    }

    @Override
    public void createSportEvent(SportEventDTO sportEventDTO) {
        var sportEventEntity = sportEventMapper.mapSportEventDTOToSportEvent(sportEventDTO);
        sportEventRepository.save(sportEventEntity);
    }

    @Override
    public void updateSportField(int id, SportEventDTO sportEventDTO) {
        var sportEventEntity = sportEventRepository.findById(id).get();
        sportEventEntity.setName(sportEventDTO.getName());
        sportEventEntity.setStartTime(sportEventDTO.getStartTime());
        sportEventEntity.setEndTime(sportEventDTO.getEndTime());
        sportEventEntity.setSportField(sportEventDTO.getSportField());
        sportEventRepository.save(sportEventEntity);
    }

    @Override
    public void deleteSportEvent(int id) {
        sportEventRepository.deleteById(id);
    }
}
