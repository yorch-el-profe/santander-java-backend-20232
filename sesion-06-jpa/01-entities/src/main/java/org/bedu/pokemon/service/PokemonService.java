package org.bedu.pokemon.service;

import java.util.List;

import org.bedu.pokemon.dto.CreatePokemonDTO;
import org.bedu.pokemon.dto.PokemonDTO;
import org.bedu.pokemon.mapper.PokemonMapper;
import org.bedu.pokemon.model.Pokemon;
import org.bedu.pokemon.repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PokemonService {
    
    @Autowired
    private PokemonRepository repository;

    @Autowired
    private PokemonMapper mapper;

    public List<PokemonDTO> findAll() {
        return repository
            .findAll()
            .stream()
            .map(mapper::toDTO)
            .toList();
    }

    public PokemonDTO save(CreatePokemonDTO data) {
        Pokemon entity = repository
            .save(mapper.toModel(data));
        
        return mapper.toDTO(entity);
    }
}
