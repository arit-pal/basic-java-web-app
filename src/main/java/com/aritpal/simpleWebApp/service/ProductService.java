package com.aritpal.simpleWebApp.service;

import com.aritpal.simpleWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    List<Product> products = List.of(new Product(101, "iPhone", 50000), new Product(102, "Bulb", 100));

    public List<Product> getProducts() {
        return products;
    }
}
