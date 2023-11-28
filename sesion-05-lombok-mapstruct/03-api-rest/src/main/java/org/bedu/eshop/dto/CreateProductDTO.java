package org.bedu.eshop.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CreateProductDTO {
    @NotBlank(message = "El nombre del producto es obligatorio")
    private String name;

    @Min(value = 1, message = "La cantidad debe ser mayor a cero")
    private int stock;

    @DecimalMin(value = "0.0", message = "El precio debe ser mayor o igual a cero")
    private double price;
}
