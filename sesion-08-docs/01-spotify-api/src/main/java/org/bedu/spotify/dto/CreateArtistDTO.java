package org.bedu.spotify.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CreateArtistDTO {
    
    @NotBlank
    private String name;
}
