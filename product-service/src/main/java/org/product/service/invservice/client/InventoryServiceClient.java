package org.product.service.invservice.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "inventories" , url= "http://localhost:8000", fallback=HystrixInventoryFallback.class)
public interface InventoryServiceClient {

	@RequestMapping(method= RequestMethod.GET, value="/api/v1/inventory/{productId}")
	public Integer getInventory(@PathVariable("productId") Long productId);
}