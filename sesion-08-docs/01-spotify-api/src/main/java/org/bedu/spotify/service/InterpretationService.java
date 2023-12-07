package org.bedu.spotify.service;

import org.bedu.spotify.dto.SongDTO;
import org.bedu.spotify.mapper.InterpretationMapper;
import org.bedu.spotify.mapper.SongMapper;
import org.bedu.spotify.repository.InterpretationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InterpretationService {

    @Autowired
    private InterpretationRepository repository;

    @Autowired
    private InterpretationMapper mapper;

    @Autowired
    private SongMapper songMapper;

    public void addSong(long artistId, long songId) {
        repository.save(mapper.toModel(artistId, songId));
    }

    public List<SongDTO> findSongsByArtist(long artistId) {
        return songMapper.toDTO(repository.findSongsByArtist(artistId));
    }
}
