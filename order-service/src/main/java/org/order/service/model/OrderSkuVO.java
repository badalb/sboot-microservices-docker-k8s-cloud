package org.order.service.model;

import java.io.Serializable;

public class OrderSkuVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1962327427822973278L;

	private Long productId;

	private Double price;

	private String currency;

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

}
