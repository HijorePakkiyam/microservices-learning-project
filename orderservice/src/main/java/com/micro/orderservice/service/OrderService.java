package com.micro.orderservice.service;

import com.micro.orderservice.feign.InventoryClient;
import com.micro.orderservice.model.Orders;
import com.micro.orderservice.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {


    private final InventoryClient inventoryClient;
    private final OrderRepository repository;

    public Orders createOrder(
            Orders order) {

        boolean stock =
                inventoryClient.checkStock(
                        order.getProductId(),
                        order.getQuantity());

        if(!stock) {
            throw new RuntimeException(
                    "Out of Stock");
        }

        return repository.save(order);
    }

}
