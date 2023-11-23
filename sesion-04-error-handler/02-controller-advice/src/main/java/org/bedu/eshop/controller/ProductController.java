package org.bedu.eshop.controller;

import java.util.List;

import org.bedu.eshop.dto.CreateProductDTO;
import org.bedu.eshop.dto.ProductDTO;
import org.bedu.eshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
public class ProductController {
    
    @Autowired
    private ProductService productService;

    @RequestMapping("/obtenerProductos")
    public List<ProductDTO> getAll() {
        return productService.getAll();
    }

    @RequestMapping("/crearProducto")
    public ProductDTO save(@Valid @RequestBody CreateProductDTO data) {
        return productService.save(data);
    }
}
