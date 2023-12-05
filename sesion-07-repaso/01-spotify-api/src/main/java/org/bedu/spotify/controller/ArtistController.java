package org.bedu.spotify.controller;

import java.util.List;

import org.bedu.spotify.dto.AddSongDTO;
import org.bedu.spotify.dto.ArtistDTO;
import org.bedu.spotify.dto.CreateArtistDTO;
import org.bedu.spotify.service.ArtistService;
import org.bedu.spotify.service.InterpretationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @Autowired
    private InterpretationService interpretationService;

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

    // Ejemplo: Agregar la canción con id 1 al artista con id 52
    // POST /artists/52/songs
    // body: { songId: 1 }
    @PostMapping("{artistId}/songs")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void addSong(@PathVariable long artistId, @RequestBody AddSongDTO data) {
        interpretationService.addSong(artistId, data.getSongId());
    }

    // Ejemplo: Obtener todas las canciones del artista con id 52
    // GET /artists/52/songs

    // Ejemplo: Quitar la canción con id 1 al artista con id 52
    // DELETE /artists/52/songs/1
}