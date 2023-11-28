package org.bedu.eshop.mapper;

import org.bedu.eshop.dto.CreateProductDTO;
import org.bedu.eshop.dto.ProductDTO;
import org.bedu.eshop.model.Product;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface ProductMapper {
    
    // source: Product
    // target: ProductDTO
    // No hay anotaciones porque la conversión es uno a uno, es decir
    // Product.id -> ProductDTO.id
    // Product.name -> ProductDTO.name
    ProductDTO toDTO(Product model);

    // source: CreateProductDTO -> Objeto de entrada
    // target: Product -> Objeto de salida

    // En el target se va a ignorar el campo "id"
    @Mapping(target = "id", ignore = true)
    // "stock" en el source pasa a ser "quantity" en el target
    @Mapping(source = "stock", target = "quantity")
    Product toModel(CreateProductDTO dto);
}
