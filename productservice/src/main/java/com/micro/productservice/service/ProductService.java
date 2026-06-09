package com.micro.productservice.service;

import com.micro.productservice.dto.InventoryRequest;
import com.micro.productservice.feign.InventoryClient;
import com.micro.productservice.model.Product;
import com.micro.productservice.repository.ProductRepository;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final  ProductRepository repository;

    private final InventoryClient inventoryClient;

    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    @RateLimiter(
            name = "productservice",
            fallbackMethod = "rateLimitFallback")
    public Product save(Product product) {

        Product savedProduct = repository.save(product);

        InventoryRequest request =
                new InventoryRequest(
                        savedProduct.getId(),
                        0
                );

        inventoryClient.createInventory(request);

        return savedProduct;
    }


    public String rateLimitFallback(
            Product product,
            Exception ex) {

        return "Too many requests. Please try again later.";
    }
}
