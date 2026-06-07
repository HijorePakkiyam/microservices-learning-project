package com.micro.productservice.controller;

import com.micro.productservice.model.Product;
import com.micro.productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService service;

    @GetMapping(value = "/getAllProducts")
    public List<Product> getProducts() {
        return service.getAllProducts();
    }

    @PostMapping(value = "createProduct")
    public Product createProduct(
            @RequestBody Product product) {
        return service.save(product);
    }

}
