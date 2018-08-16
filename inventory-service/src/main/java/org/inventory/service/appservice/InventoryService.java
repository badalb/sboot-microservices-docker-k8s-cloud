package org.inventory.service.appservice;

import java.util.Optional;

import org.inventory.service.domain.Inventory;

public interface InventoryService {

	public Optional<Inventory> getProductInventory(Long productId);
}
