package com.micro.inventryservice.controller;

import com.micro.inventryservice.model.Inventory;
import com.micro.inventryservice.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping(value = "/inventory")
    public Inventory createInventory(@RequestBody Inventory inventory){
      return service.createInventory(inventory);
    }
}
