package org.bedu.pokemon.service;

import java.util.List;

import org.bedu.pokemon.dto.TrainerDTO;
import org.bedu.pokemon.mapper.TrainerMapper;
import org.bedu.pokemon.model.Trainer;
import org.bedu.pokemon.repository.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrainerService {
    
    @Autowired
    private TrainerRepository repository;

    @Autowired
    private TrainerMapper mapper;

    public List<TrainerDTO> findAll() {
        List<Trainer> data = repository.findAll();
        return data.stream().map(mapper::toDTO).toList();
    }
}
