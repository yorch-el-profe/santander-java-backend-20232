package org.bedu.doctor.exception;


public class PacientNotFoundException extends RuntimeException {
    
    public PacientNotFoundException(long id) {
        super("ERR_PAC_NOT_FOUND", "El paciente no existe", id);
    }
}
