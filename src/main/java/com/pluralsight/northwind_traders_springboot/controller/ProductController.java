package com.pluralsight.northwind_traders_springboot.controller;

import com.pluralsight.northwind_traders_springboot.model.Product;
import com.pluralsight.northwind_traders_springboot.repository.ProductRepository;
import com.pluralsight.northwind_traders_springboot.service.ProductService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@CrossOrigin(origins = "*")
public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getAllProducts(){
         return productService.getAllProducts();
    }
}
