package org.bedu.doctor.mapper;

import org.bedu.doctor.dto.MedicalRecordDTO;
import org.bedu.doctor.model.MedicalRecord;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface MedicalRecordMapper {
    
    MedicalRecordDTO toDTO(MedicalRecord model);
}
