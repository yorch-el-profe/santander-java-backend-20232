package org.bedu.doctor.config;

import java.util.List;

import org.bedu.doctor.dto.ErrorDTO;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.bedu.doctor.exception.RuntimeException;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestControllerAdvice
public class ErrorHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorDTO validationError(MethodArgumentNotValidException ex) {
        List<FieldError> fieldErrors = ex.getBindingResult().getFieldErrors();
        List<String> errors = fieldErrors.stream().map(x -> x.getDefaultMessage()).toList();
        return ErrorDTO.builder()
            .code("ERR_VALID")
            .message("Los datos de entrada contiene errores")
            .details(errors)
            .build();
    }

    @ExceptionHandler(RuntimeException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorDTO runtimeError(RuntimeException ex) {
        return ErrorDTO.builder()
            .code(ex.getCode())
            .message(ex.getMessage())
            .details(ex.getDetails())
            .build();
    }

    
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorDTO unknownError(Exception ex) {
        log.error(ex.getMessage());
        return ErrorDTO.builder()
            .code("ERR_UNKNOWN")
            .message("Ocurrió un error inesperado...")
            .build();
    }
}
