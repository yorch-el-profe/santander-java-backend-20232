package org.bedu.doctor.service;

import org.bedu.doctor.dto.MedicalRecordDTO;
import org.bedu.doctor.mapper.MedicalRecordMapper;
import org.bedu.doctor.model.MedicalRecord;
import org.bedu.doctor.repository.MedicalRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicalRecordService {
    
    @Autowired
    private MedicalRecordRepository repository;

    @Autowired
    private MedicalRecordMapper mapper;

    public MedicalRecordDTO save() {
        MedicalRecord model = new MedicalRecord();
        MedicalRecord entity = repository.save(model);
        return mapper.toDTO(entity);
    }
}
