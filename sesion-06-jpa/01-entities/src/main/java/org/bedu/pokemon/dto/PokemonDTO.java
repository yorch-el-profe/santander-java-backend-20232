package org.bedu.pokemon.dto;

import org.bedu.pokemon.model.Type;

import lombok.Data;

@Data
public class PokemonDTO {
    
    private long id;
    private int number;
    private String name;
    private Type type;
}
