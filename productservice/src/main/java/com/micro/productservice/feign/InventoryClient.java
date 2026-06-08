package com.micro.productservice.feign;

import com.micro.productservice.dto.InventoryRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name="inventryservice")
public interface InventoryClient {

    @PostMapping("/inventory/inventory")
    void createInventory(
            @RequestBody InventoryRequest request);
}
