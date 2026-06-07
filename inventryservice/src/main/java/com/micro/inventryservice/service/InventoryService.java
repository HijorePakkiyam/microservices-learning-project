package com.micro.inventryservice.service;

import com.micro.inventryservice.model.Inventory;
import com.micro.inventryservice.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InventoryService {

    private final InventoryRepository repository;

    public boolean isInStock(
            Long productId,
            int quantity) {

        Inventory inventory =
                repository.findByProductId(productId)
                        .orElseThrow();

        return inventory.getQuantity() >= quantity;
    }
}
