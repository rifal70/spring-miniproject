package com.spring.miniproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.miniproject.model.Product;
import com.spring.miniproject.repository.ProductRepository;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public int addProduct(Product product) {
        return productRepository.addProduct(product);
    }
    
     public List<Product> getAllProducts() {
        return productRepository.getAllProducts();
    }
}