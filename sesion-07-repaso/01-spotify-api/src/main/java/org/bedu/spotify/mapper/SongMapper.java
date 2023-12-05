package org.bedu.spotify.mapper;

import org.bedu.spotify.dto.CreateSongDTO;
import org.bedu.spotify.dto.SongDTO;
import org.bedu.spotify.model.Song;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface SongMapper {
    
    SongDTO toDTO(Song model);

    List<SongDTO> toDTO(List<Song> model);

    @Mapping(target = "id", ignore = true)
    Song toModel(CreateSongDTO dto);
}
