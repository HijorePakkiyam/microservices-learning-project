package com.micro.productservice.service;

import com.micro.productservice.model.Product;
import com.micro.productservice.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private  ProductRepository repository;

    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    public Product save(Product product) {
        return repository.save(product);
    }
}
