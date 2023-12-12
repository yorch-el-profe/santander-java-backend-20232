package org.bedu.doctor.controller;

import java.util.List;

import org.bedu.doctor.dto.CreatePacientDTO;
import org.bedu.doctor.dto.PacientDTO;
import org.bedu.doctor.service.PacientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("pacients")
public class PacientController {
    
    @Autowired
    private PacientService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<PacientDTO> findAll() {
        return service.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PacientDTO save(@Valid @RequestBody CreatePacientDTO data) {
        return service.save(data);
    }
}
