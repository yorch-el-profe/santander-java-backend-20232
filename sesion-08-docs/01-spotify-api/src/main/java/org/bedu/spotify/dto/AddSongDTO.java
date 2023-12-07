package org.bedu.spotify.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class AddSongDTO {
    
    @Schema(description = "Identificador de la canción a asociar", example = "10")
    private long songId;
}
