package org.bedu.spotify.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class SongDTO {
    
    @Schema(description = "Identificador de la canción", example = "30")
    private long id;

    @Schema(description = "Nombre de la canción", example = "La Chona")
    private String name;

    @Schema(description = "Duración de la canción", example = "185")
    private int duration;
}
