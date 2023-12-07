package org.bedu.spotify.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RuntimeException extends Exception {
    
    private String code;
    private Object details;

    public RuntimeException(String code, String message, Object details) {
        super(message);
        this.code = code;
        this.details = details;
    }
}
