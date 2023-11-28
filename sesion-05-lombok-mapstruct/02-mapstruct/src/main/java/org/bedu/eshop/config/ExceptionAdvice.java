package org.bedu.eshop.config;

import java.util.LinkedList;
import java.util.List;

import org.bedu.eshop.dto.ErrorDTO;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionAdvice {
    
    // Este método se va ejecutar cuando se detecten errores de validacion
    // es decir, cuando se lancen excepciones de tipo MethodArgumentNotValidException.
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ErrorDTO validationErrors(MethodArgumentNotValidException ex) {
        List<FieldError> fieldErrors = ex.getBindingResult().getFieldErrors();
        List<String> errors = new LinkedList<>();

        // Extrayendo los mensajes de error directamente de la excepción
        for (FieldError fieldError : fieldErrors) {
            errors.add(fieldError.getDefaultMessage());
        }

        return new ErrorDTO("ERR_VALID", "Hubo un error al validar los datos de entrada", errors);
    }
}
