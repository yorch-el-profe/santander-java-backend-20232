package org.bedu.pokemon.mapper;

import org.bedu.pokemon.dto.CreateTrainerDTO;
import org.bedu.pokemon.dto.TrainerDTO;
import org.bedu.pokemon.model.Trainer;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface TrainerMapper {

    TrainerDTO toDTO(Trainer model);

    @Mapping(target = "id", ignore = true)
    Trainer toModel(CreateTrainerDTO dto);
}
