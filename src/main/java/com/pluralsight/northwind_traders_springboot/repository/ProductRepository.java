package com.pluralsight.northwind_traders_springboot.repository;

import com.pluralsight.northwind_traders_springboot.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product , Long> {
    Product findByProductId(Long id);
    List<Product> findByPriceLessthan(BigDecimal targetPrice);

}
