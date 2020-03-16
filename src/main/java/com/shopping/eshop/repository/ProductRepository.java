package com.shopping.eshop.repository;

import com.shopping.eshop.model.Product;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import reactor.core.publisher.Flux;
@Repository
public interface ProductRepository extends ReactiveCrudRepository<Product, Long> {
    @Query("SELECT * FROM product WHERE status = 'Available'")
    Flux<Product> findAll();

    @Query("SELECT * FROM product WHERE price =?1 and status = 'Available'")
    Flux<Product> findByPrice(String value);

    @Query("SELECT * FROM product WHERE color =?1 and status = 'Available'")
    Flux<Product> findByColor(String value);

    @Query("SELECT * FROM product WHERE item_size =?1 and status = 'Available'")
    Flux<Product> findBySize(String value);

    @Query("SELECT * FROM product WHERE sku =?1 and status = 'Available'")
    Flux<Product> findBySKU(String value);

    @Query("SELECT * FROM sellers WHERE name=?1")
    Flux<Product> findSellerId(String name);

    @Query("SELECT * FROM product WHERE id in " +
            "(SELECT product_id FROM product_Sellers WHERE seller_id= ?1) and status = 'Available'")
    Flux<Product> findProductsBySellerId(Long id);

    @Query("SELECT * FROM product WHERE id in " +
            "(SELECT product_id FROM product_brand WHERE brand_id = ?1) and status = 'Available'")
    Flux<Product> findProductsByBrandId(Long id);

}
