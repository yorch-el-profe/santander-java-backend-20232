package org.bedu.doctor.service;

import java.util.List;

import org.bedu.doctor.dto.PacientDTO;
import org.bedu.doctor.mapper.PacientMapper;
import org.bedu.doctor.model.Pacient;
import org.bedu.doctor.repository.PacientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PacientService {
    
    @Autowired
    private PacientRepository repository;

    @Autowired
    private PacientMapper mapper;

    public List<PacientDTO> findAll() {
        List<Pacient> data = repository.findAll();
        return mapper.toDTO(data);
    }
}
