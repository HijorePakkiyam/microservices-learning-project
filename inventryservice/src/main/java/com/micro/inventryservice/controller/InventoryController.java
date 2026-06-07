package com.micro.inventryservice.controller;

import com.micro.inventryservice.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inventory")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService service;

    @GetMapping("/{productId}/{quantity}")
    public boolean checkStock(
            @PathVariable Long productId,
            @PathVariable int quantity) {

        return service.isInStock(productId, quantity);
    }
}
