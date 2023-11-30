package org.bedu.pokemon.dto;

import org.bedu.pokemon.model.Type;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class CreatePokemonDTO {
    
    @Min(1)
    @Max(907)
    private int number;

    @NotBlank
    private String name;

    @NotNull
    private Type type;
}
