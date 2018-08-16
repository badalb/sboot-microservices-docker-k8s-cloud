package org.inventory.service.rest;

import java.util.Optional;

import org.dozer.DozerBeanMapper;
import org.inventory.service.appservice.InventoryService;
import org.inventory.service.domain.Inventory;
import org.inventory.service.model.InventoryVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class InventoryRestService {

	@Autowired
	private InventoryService inventoryService;

	@Autowired
	private DozerBeanMapper beanMapper;

	@GetMapping("/inventories/{productId}")
	public @ResponseBody ResponseEntity<InventoryVO> getProductInventory(@PathVariable Long productId) {
		Optional<Inventory> inventory = inventoryService.getProductInventory(productId);
		InventoryVO inventoryVO = new InventoryVO();
		inventory.ifPresent(value -> {
			beanMapper.map(value, inventoryVO);
		});

		return new ResponseEntity<InventoryVO>(inventoryVO, HttpStatus.OK);
	}

}
