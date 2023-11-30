package org.bedu.pokemon.controller;

import java.util.List;

import org.bedu.pokemon.dto.CreatePokemonDTO;
import org.bedu.pokemon.dto.PokemonDTO;
import org.bedu.pokemon.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("pokemon")
public class PokemonController {
    
    @Autowired
    private PokemonService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<PokemonDTO> findAll() {
        return service.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PokemonDTO save(@Valid @RequestBody CreatePokemonDTO data) {
        return service.save(data);
    }
}
