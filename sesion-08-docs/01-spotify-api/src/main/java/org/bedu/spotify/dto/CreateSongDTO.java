package org.bedu.spotify.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CreateSongDTO {
    
    @NotBlank
    private String name;

    @Min(1)
    private int duration;
}
