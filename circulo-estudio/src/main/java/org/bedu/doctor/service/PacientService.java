package org.bedu.doctor.service;

import java.util.List;
import java.util.Optional;

import org.bedu.doctor.dto.CreatePacientDTO;
import org.bedu.doctor.dto.PacientDTO;
import org.bedu.doctor.dto.UpdatePacientDTO;
import org.bedu.doctor.exception.PacientNotFoundException;
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

    public PacientDTO save(CreatePacientDTO data) {
        Pacient model = mapper.toModel(data);
        Pacient result = repository.save(model);
        return mapper.toDTO(result);
    }

    public void update(long id, UpdatePacientDTO data) throws PacientNotFoundException {
        Optional<Pacient> result = repository.findById(id);

        if (result.isEmpty()) {
            throw new PacientNotFoundException(id);
        }

        Pacient model = result.get();

        mapper.update(model, data);

        repository.save(model);
    }
}
