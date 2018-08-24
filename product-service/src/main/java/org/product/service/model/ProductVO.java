package org.product.service.model;

import java.io.Serializable;

import org.product.service.domain.Price;

public class ProductVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6445868425864645423L;

	private Long id;
	
	private String name;
	
	private String description;
	
	private Price price;
	
	private Integer inventory;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Price getPrice() {
		return price;
	}

	public void setPrice(Price price) {
		this.price = price;
	}

	public Integer getInventory() {
		return inventory;
	}

	public void setInventory(Integer inventory) {
		this.inventory = inventory;
	}
}
