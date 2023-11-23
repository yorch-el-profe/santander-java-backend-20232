package org.bedu.eshop.config;

import org.bedu.eshop.dto.ErrorDTO;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionAdvice {
    
    // Este método se va ejecutar cuando se detecten errores de validacion
    // es decir, cuando se lancen excepciones de tipo MethodArgumentNotValidException.
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ErrorDTO validationErrors() {
        return new ErrorDTO("ERR_VALID", "Hubo un error al validar los datos de entrada", null);
    }
}
