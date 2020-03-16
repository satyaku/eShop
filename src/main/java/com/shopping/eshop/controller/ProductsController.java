package com.shopping.eshop.controller;

import com.shopping.eshop.customExceptions.InvalidParseException;
import com.shopping.eshop.model.Product;
import com.shopping.eshop.services.ProductsApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/products")
public class ProductsController {

    @Autowired
    private ProductsApplicationService productsApplicationService;


    /**
     * This endpoint is to get all available products
     * @return the available products of all type
     */
    @GetMapping
    public Flux<Product> findAll() {
        return productsApplicationService.findAll();
    }


    /**
     *
     * This endpoint is used for getting all the products based on
     * certain condition, like attribute and values
     * valid attributes : sku, price, brand, color, size
     * @param attribute
     * @param value
     * @return product list based on conditions
     * @throws InvalidParseException
     */
    @RequestMapping("/query")
    public @ResponseBody Flux getProductResponse(@RequestParam("attribute") String attribute,
                                                 @RequestParam("value") String value) throws InvalidParseException {
        return productsApplicationService.getProductResponse(attribute, value);

    }




}