package org.bedu.spotify.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorDTO {
    
    private String code;
    private String message;
    private Object details;
}
