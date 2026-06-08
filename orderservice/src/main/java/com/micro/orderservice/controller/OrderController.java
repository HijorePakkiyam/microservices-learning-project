package com.micro.orderservice.controller;

import com.micro.orderservice.model.Orders;
import com.micro.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService service;


    @GetMapping(value = "/getAllOrders")
    public List<Orders> getOrders() {
        return service.getAllOrders();
    }

    @PostMapping(value = "createOrder")
    public String placeOrder(
            @RequestBody Orders order) {

        return service.createOrder(order);
    }
}
