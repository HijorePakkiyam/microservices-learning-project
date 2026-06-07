package com.micro.orderservice.controller;

import com.micro.orderservice.model.Orders;
import com.micro.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService service;

    @PostMapping
    public Orders placeOrder(
            @RequestBody Orders order) {

        return service.createOrder(order);
    }
}
