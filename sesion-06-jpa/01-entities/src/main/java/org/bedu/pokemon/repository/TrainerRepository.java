package org.bedu.pokemon.repository;

import java.util.List;

import org.bedu.pokemon.model.Trainer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainerRepository extends CrudRepository<Trainer, Long> {
    
    List<Trainer> findAll();
}
