package org.inventory.service.repository;

import java.util.Optional;

import org.inventory.service.domain.Inventory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepository extends CrudRepository<Inventory, Long> {

	public Optional<Inventory> findByProductId(Long productId);
}
