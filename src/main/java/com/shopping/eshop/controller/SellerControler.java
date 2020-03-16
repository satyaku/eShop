package com.shopping.eshop.controller;

import com.shopping.eshop.model.SellerCountResponse;
import com.shopping.eshop.services.SellersApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sellers")
public class SellerControler {

    @Autowired
    private SellersApplicationService sellersApplicationService;


    /**
     *This endpoint is used for returning the available number of
     * products by a seller
     * @param id
     * @return SellerCountResponse
     */
    @RequestMapping(path="/countProducts/{id}")
    public SellerCountResponse getCount(@PathVariable("id") Long id) {
        return sellersApplicationService.getCount(id);
    }

}
