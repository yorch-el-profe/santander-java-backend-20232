package org.bedu.spotify.mapper;

import org.bedu.spotify.model.Interpretation;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface InterpretationMapper {

    // Los mapper no aceptan tipos de datos primitivos como entrada
    // por lo tanto, se usan los wrapper class
    // long -> Long
    @Mapping(source = "artistId", target = "id.artistId")
    @Mapping(source = "artistId", target = "artist.id")
    @Mapping(source = "songId", target = "id.songId")
    @Mapping(source = "songId", target = "song.id")
    Interpretation toModel(Long artistId, Long songId);
}
