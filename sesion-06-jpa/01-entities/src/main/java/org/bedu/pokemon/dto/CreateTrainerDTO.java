package org.bedu.pokemon.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CreateTrainerDTO {
    
    @NotBlank
    private String name;
}
