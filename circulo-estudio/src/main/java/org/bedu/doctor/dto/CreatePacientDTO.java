package org.bedu.doctor.dto;

import java.util.Date;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class CreatePacientDTO {
    
    @NotBlank(message = "El nombre del paciente es obligatorio")
    private String name;

    @NotBlank(message = "El correo electrónico es obligatorio")
    @Email(message = "El correo electrónico debe tener un formato válido")
    private String email;

    @NotBlank(message = "El número de seguridad social es obligatorio")
    private String nss;

    @NotNull(message = "La fecha de nacimiento es obligatoria")
    private Date birthDate;
}
