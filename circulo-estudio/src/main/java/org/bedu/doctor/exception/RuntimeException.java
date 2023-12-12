package org.bedu.doctor.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RuntimeException extends Exception {
    
    private String code;
    private Object details;

    public RuntimeException(String message, String code, Object details) {
        super(message);
        this.code = code;
        this.details = details;
    }
}
