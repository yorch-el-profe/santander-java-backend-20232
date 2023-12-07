package org.bedu.spotify.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class ArtistDTO {
    
    @Schema(description = "Identificador del artista", example = "20")
    private long id;

    @Schema(description = "Nombre del artista", example = "Los Tucanes de Tijuana")
    private String name;
}
