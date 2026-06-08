package com.micro.orderservice.service;

import com.micro.orderservice.feign.InventoryClient;
import com.micro.orderservice.model.Orders;
import com.micro.orderservice.repository.OrderRepository;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {


    private final InventoryClient inventoryClient;
    private final OrderRepository repository;

    @CircuitBreaker(
            name = "inventryservice",
            fallbackMethod = "inventoryFallback"
    )
    public String  createOrder(
            Orders order) {

        boolean stock =
                inventoryClient.checkStock(
                        order.getProductId(),
                        order.getQuantity());

        if(!stock) {
            return "Product Out Of Stock";
        }

        repository.save(order);
        return "Order Created";

    }


    public List<Orders> getAllOrders() {
        return repository.findAll();
    }

    public String inventoryFallback(
            Long productId,
            int quantity,
            Exception ex) {

        return "Inventory Service is currently unavailable";
    }

}
