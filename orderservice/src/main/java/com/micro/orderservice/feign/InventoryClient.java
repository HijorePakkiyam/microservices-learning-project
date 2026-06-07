package com.micro.orderservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="inventryservice")
public interface InventoryClient {

    @GetMapping(
            "/inventory/{productId}/{quantity}")
    boolean checkStock(
            @PathVariable Long productId,
            @PathVariable int quantity);

}
