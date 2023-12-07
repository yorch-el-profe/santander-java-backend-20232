package org.bedu.spotify.mapper;

import java.util.List;

import org.bedu.spotify.dto.ArtistDTO;
import org.bedu.spotify.dto.CreateArtistDTO;
import org.bedu.spotify.dto.UpdateArtistDTO;
import org.bedu.spotify.model.Artist;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface ArtistMapper {
    
    ArtistDTO toDTO(Artist model);
    
    List<ArtistDTO> toDTO(List<Artist> model);

    @Mapping(target = "id", ignore = true)
    Artist toModel(CreateArtistDTO dto);

    // En vez de transformar un UpdateArtistDTO a Artist
    // actualiza la referencia de Artist con lo que haya en UpdateArtistDTO
    @Mapping(target = "id", ignore = true)
    void update(@MappingTarget Artist artist, UpdateArtistDTO data);
}
