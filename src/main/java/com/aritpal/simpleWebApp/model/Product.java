package com.aritpal.simpleWebApp.model;

import lombok.Data;

@Data
public class Product {

    private int prodId;
    private String prodName;
    private int prodPrice;

    public Product(int prodId, String prodName, int prodPrice) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.prodPrice = prodPrice;
    }
}
