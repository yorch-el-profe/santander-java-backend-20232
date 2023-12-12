package org.bedu.doctor.exception;


public class PacientNotFoundException extends RuntimeException {
    
    public PacientNotFoundException(long id) {
        super("El paciente no existe", "ERR_PAC_NOT_FOUND", id);
    }
}
