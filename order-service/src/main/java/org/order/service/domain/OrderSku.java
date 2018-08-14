package org.order.service.domain;

import java.io.Serializable;

public class OrderSku implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3896993483654974458L;

	private Long skuId;

	private Order order;

	private Long productId;

	private Double price;

	public Long getSkuId() {
		return skuId;
	}

	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

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
}
