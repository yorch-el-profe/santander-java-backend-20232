package org.bedu.pokemon.repository;

import java.util.List;

import org.bedu.pokemon.model.Pokemon;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PokemonRepository extends CrudRepository<Pokemon, Long> {

    List<Pokemon> findAll();
}
