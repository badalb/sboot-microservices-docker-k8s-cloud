package org.product.service.invservice.client;

import org.springframework.stereotype.Component;

@Component
public class HystrixInventoryFallback implements InventoryServiceClient {

	public Integer getInventory(Long isbn) {
		return 0;
	}
}