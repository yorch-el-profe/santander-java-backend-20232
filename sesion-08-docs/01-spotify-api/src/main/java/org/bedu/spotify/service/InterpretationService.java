package org.bedu.spotify.service;

import org.bedu.spotify.mapper.InterpretationMapper;
import org.bedu.spotify.repository.InterpretationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InterpretationService {

    @Autowired
    private InterpretationRepository repository;

    @Autowired
    private InterpretationMapper mapper;

    public void addSong(long artistId, long songId) {
        repository.save(mapper.toModel(artistId, songId));
    }
}
