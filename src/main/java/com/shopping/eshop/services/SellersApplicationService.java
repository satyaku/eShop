package com.shopping.eshop.services;

import com.shopping.eshop.model.Product;
import com.shopping.eshop.model.SellerCountResponse;
import com.shopping.eshop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Component
public class SellersApplicationService {

    @Autowired
    private ProductRepository productRepository;

    public SellerCountResponse getCount(@PathVariable("id") Long id) {
        List<Product> elements = new ArrayList<>();
        productRepository.findProductsBySellerId(id).subscribe(elements::add);
        return new SellerCountResponse(elements.size());

    }
}
