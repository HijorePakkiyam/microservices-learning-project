package com.micro.orderservice.service;

import com.micro.orderservice.feign.InventoryClient;
import com.micro.orderservice.model.Orders;
import com.micro.orderservice.repository.OrderRepository;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {


    private final InventoryClient inventoryClient;
    private final OrderRepository repository;
//    circuit breaker only hit the respective service 5 as per config ,
//    then its always return fallback response , after 10 sec will go to halfopen state to check the
//    service is up/down as per config

    @CircuitBreaker(
            name = "inventryservice",
            fallbackMethod = "inventoryFallback"
    )
    //  retry is hit 3 time is a row continously as per config per request respective service as per config
    @Retry(
            name = "inventoryService")
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
            Orders order,
            Exception ex) {
        System.out.println("hijore");
        return "Inventory Service is currently unavailable";
    }

}
