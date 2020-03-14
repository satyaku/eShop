package com.shopping.eshop.repository;

import com.shopping.eshop.model.Product;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import reactor.core.publisher.Flux;

public interface ProductRepository extends ReactiveCrudRepository<Product, Long> {
    @Query("SELECT * FROM product")
    Flux<Product> findAll();

    @Query("SELECT * FROM product WHERE sku = :sku")
    Flux<Product> findBySKU(String sku);
}
