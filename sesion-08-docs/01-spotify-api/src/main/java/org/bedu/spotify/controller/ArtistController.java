package org.bedu.spotify.controller;

import java.util.List;

import org.bedu.spotify.dto.AddSongDTO;
import org.bedu.spotify.dto.ArtistDTO;
import org.bedu.spotify.dto.CreateArtistDTO;
import org.bedu.spotify.dto.SongDTO;
import org.bedu.spotify.dto.UpdateArtistDTO;
import org.bedu.spotify.service.ArtistService;
import org.bedu.spotify.service.InterpretationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@Tag(name = "Endpoints de Artistas", description = "CRUD de artistas")
@RestController
@RequestMapping("artists")
public class ArtistController {
    
    @Autowired
    private ArtistService service;

    @Autowired
    private InterpretationService interpretationService;

    @Operation(summary = "Obtiene la lista de todos los artistas")
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ArtistDTO> findAll() {
        return service.findAll();
    }

    @Operation(summary = "Crea un nuevo artista")
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ArtistDTO save(@Valid @RequestBody CreateArtistDTO data) {
        return service.save(data);
    }

    @Operation(summary = "Asocia una canción a un artista")
    @PostMapping("{artistId}/songs")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void addSong(@PathVariable long artistId, @RequestBody AddSongDTO data) {
        interpretationService.addSong(artistId, data.getSongId());
    }

    @Operation(summary = "Obtiene las canciones de un artista determinado")
    @GetMapping("{artistId}/songs")
    @ResponseStatus(HttpStatus.OK)
    public List<SongDTO> findSongsByArtist(@PathVariable long artistId) {
        return interpretationService.findSongsByArtist(artistId);
    }

    @Operation(summary = "Actualiza la información de un artista")
    @PutMapping("{artistId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void update(@PathVariable long artistId, @Valid @RequestBody UpdateArtistDTO data) throws Exception {
        service.update(artistId, data);
    }
}