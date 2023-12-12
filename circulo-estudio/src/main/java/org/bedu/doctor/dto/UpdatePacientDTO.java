package org.bedu.doctor.dto;

import java.util.Date;

import jakarta.validation.constraints.Email;
import lombok.Data;

@Data
public class UpdatePacientDTO {

    private String name;

    @Email(message = "El correo electrónico debe tener un formato válido")
    private String email;
    
    private String nss;

    private Date birthDate;
}
