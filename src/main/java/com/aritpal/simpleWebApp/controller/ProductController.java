package com.aritpal.simpleWebApp.controller;

import com.aritpal.simpleWebApp.model.Product;
import com.aritpal.simpleWebApp.service.ProductService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @RequestMapping("/products")
    public List<Product> getProductDetails() {
        return service.getProducts();
    }
}
