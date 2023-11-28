package org.bedu.eshop.service;
import java.util.LinkedList;
import java.util.List;

import org.bedu.eshop.dto.CreateProductDTO;
import org.bedu.eshop.dto.ProductDTO;
import org.bedu.eshop.mapper.ProductMapper;
import org.bedu.eshop.model.Product;
import org.bedu.eshop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductMapper productMapper;

    public List<ProductDTO> getAll() {
        List<Product> products = productRepository.getAll();

        List<ProductDTO> data = new LinkedList<>();
        
        for (Product product : products) {
            data.add(productMapper.toDTO(product));
        }

        return data;
    }

    public ProductDTO save(CreateProductDTO data) {
        Product model = productMapper.toModel(data);
        return productMapper.toDTO(productRepository.save(model));
    }
}
