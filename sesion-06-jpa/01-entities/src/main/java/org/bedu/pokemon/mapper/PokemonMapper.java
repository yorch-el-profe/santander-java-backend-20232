package org.bedu.pokemon.mapper;

import org.bedu.pokemon.dto.CreatePokemonDTO;
import org.bedu.pokemon.dto.PokemonDTO;
import org.bedu.pokemon.model.Pokemon;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface PokemonMapper {

    PokemonDTO toDTO(Pokemon model);

    @Mapping(target = "id", ignore = true)
    Pokemon toModel(CreatePokemonDTO dto);
}
