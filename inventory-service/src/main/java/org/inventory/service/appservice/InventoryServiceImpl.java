package org.inventory.service.appservice;

import java.util.Optional;

import org.inventory.service.domain.Inventory;
import org.inventory.service.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventoryServiceImpl implements InventoryService {

	@Autowired
	private InventoryRepository inventoryRepository;

	@Override
	public Optional<Inventory> getProductInventory(Long productId) {
		return inventoryRepository.findByProductId(productId);
	}

}
