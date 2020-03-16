package com.shopping.eshop.repository;

import com.shopping.eshop.model.Brand;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import reactor.core.publisher.Flux;
@Repository
public interface BrandRepository extends ReactiveCrudRepository<Brand, Long> {

    @Query("SELECT * FROM brand where name = ?1 limit 1")
    Flux<Brand> findONE(String name);

}
