package org.bedu.doctor.mapper;

import java.util.List;

import org.bedu.doctor.dto.CreatePacientDTO;
import org.bedu.doctor.dto.PacientDTO;
import org.bedu.doctor.model.Pacient;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface PacientMapper {
    
    PacientDTO toDTO(Pacient model);

    List<PacientDTO> toDTO(List<Pacient> model);

    @Mapping(target = "id", ignore = true)
    Pacient toModel(CreatePacientDTO dto);
}
