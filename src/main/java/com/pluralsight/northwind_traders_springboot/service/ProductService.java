package com.pluralsight.northwind_traders_springboot.service;

import com.pluralsight.northwind_traders_springboot.model.Product;
import com.pluralsight.northwind_traders_springboot.repository.ProductRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public Product getProductByID(int id){
        return productRepository.findByProductId(id);
    }
}
