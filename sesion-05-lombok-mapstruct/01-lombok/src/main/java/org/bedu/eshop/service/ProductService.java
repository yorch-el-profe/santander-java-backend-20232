package org.bedu.eshop.service;
import java.util.LinkedList;
import java.util.List;

import org.bedu.eshop.dto.CreateProductDTO;
import org.bedu.eshop.dto.ProductDTO;
import org.bedu.eshop.model.Product;
import org.bedu.eshop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepository productRepository;

    public List<ProductDTO> getAll() {
        List<Product> products = productRepository.getAll();

        List<ProductDTO> data = new LinkedList<>();
        
        for (Product product : products) {
            data.add(toDTO(product));
        }

        return data;
    }

    public ProductDTO save(CreateProductDTO data) {
        Product model = toModel(data);
        return toDTO(productRepository.save(model));
    }

    private Product toModel(CreateProductDTO dto) {
        return new Product(0, dto.getName(), dto.getQuantity(), dto.getPrice());
    }

    private Product toModel(ProductDTO dto) {
        return new Product(dto.getId(), dto.getName(), dto.getQuantity(), dto.getPrice());
    }

    private ProductDTO toDTO(Product model) {
        return new ProductDTO(model.getId(), model.getName(), model.getQuantity(), model.getPrice());
    }
}
