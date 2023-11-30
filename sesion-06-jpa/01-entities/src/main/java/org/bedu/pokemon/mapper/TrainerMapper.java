package org.bedu.pokemon.mapper;

import org.bedu.pokemon.dto.TrainerDTO;
import org.bedu.pokemon.model.Trainer;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface TrainerMapper {

    TrainerDTO toDTO(Trainer model);
}
