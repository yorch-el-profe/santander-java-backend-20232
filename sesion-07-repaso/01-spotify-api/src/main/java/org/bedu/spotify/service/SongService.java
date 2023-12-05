package org.bedu.spotify.service;

import org.bedu.spotify.dto.CreateSongDTO;
import org.bedu.spotify.dto.SongDTO;
import org.bedu.spotify.mapper.SongMapper;
import org.bedu.spotify.model.Song;
import org.bedu.spotify.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongService {
    
    @Autowired
    private SongRepository repository;

    @Autowired
    private SongMapper mapper;

    public List<SongDTO> findAll() {
        return mapper.toDTO(repository.findAll());
    }

    public SongDTO save(CreateSongDTO data) {
        Song entity = repository.save(mapper.toModel(data));
        return mapper.toDTO(entity);
    }
}
