package org.bedu.spotify.mapper;

import java.util.List;

import org.bedu.spotify.dto.ArtistDTO;
import org.bedu.spotify.dto.CreateArtistDTO;
import org.bedu.spotify.model.Artist;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface ArtistMapper {
    
    ArtistDTO toDTO(Artist model);
    
    List<ArtistDTO> toDTO(List<Artist> model);

    @Mapping(target = "id", ignore = true)
    Artist toModel(CreateArtistDTO dto);
}
