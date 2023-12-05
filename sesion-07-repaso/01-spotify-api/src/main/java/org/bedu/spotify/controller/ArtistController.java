package org.bedu.spotify.controller;

import java.util.List;

import org.bedu.spotify.dto.ArtistDTO;
import org.bedu.spotify.dto.CreateArtistDTO;
import org.bedu.spotify.service.ArtistService;
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
@RequestMapping("artists")
public class ArtistController {
    
    @Autowired
    private ArtistService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ArtistDTO> findAll() {
        return service.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ArtistDTO save(@Valid @RequestBody CreateArtistDTO data) {
        return service.save(data);
    }
}
