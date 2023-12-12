package org.bedu.doctor.mapper;

import java.util.List;

import org.bedu.doctor.dto.PacientDTO;
import org.bedu.doctor.model.Pacient;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface PacientMapper {
    
    PacientDTO toDTO(Pacient model);

    List<PacientDTO> toDTO(List<Pacient> model);
}
