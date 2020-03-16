package com.shopping.eshop.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@ToString
@Builder
@NoArgsConstructor
public class SellerCountResponse {
    private int count;

    public SellerCountResponse(int count) {
        this.count = count;
    }
}
