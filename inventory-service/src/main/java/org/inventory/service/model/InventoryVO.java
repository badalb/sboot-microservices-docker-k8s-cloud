package org.inventory.service.model;

import java.io.Serializable;

public class InventoryVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1118566442205412050L;
	
	private Long productId;
	
	private Long availableInventory;

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Long getAvailableInventory() {
		return availableInventory;
	}

	public void setAvailableInventory(Long availableInventory) {
		this.availableInventory = availableInventory;
	}
	
}
