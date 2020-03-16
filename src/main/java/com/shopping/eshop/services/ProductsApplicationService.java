package com.shopping.eshop.services;

import com.shopping.eshop.customExceptions.InvalidParseException;
import com.shopping.eshop.model.Brand;
import com.shopping.eshop.model.Product;
import com.shopping.eshop.repository.BrandRepository;
import com.shopping.eshop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductsApplicationService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private BrandRepository brandRepository;

    public Flux<Product> findAll() {
        return productRepository.findAll();
    }

    public Flux getProductResponse(String attribute, String value) throws InvalidParseException {
        switch (attribute) {
            case "brand":
                List<Brand> elements = new ArrayList<>();
                brandRepository.findONE(value).subscribe(elements::add);
                return productRepository.findProductsByBrandId(elements.get(0).getId());
            case "price":
                return productRepository.findByPrice(value);
            case "color":
                return productRepository.findByColor(value);
            case "size":
                return productRepository.findBySize(value);
            case "sku":
                return productRepository.findBySKU(value);
            default:
                throw new InvalidParseException("Invalid query parameter");
        }


    }
}