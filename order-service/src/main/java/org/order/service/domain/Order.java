package org.order.service.domain;

import java.io.Serializable;

public class Order implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2232766126130616598L;

	private Long orderId;
	
	private OrderStatus orderStatus;
	
	private OrderPayment orderPayment;
	
	private OrderSku orderSku;

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}

	public OrderPayment getOrderPayment() {
		return orderPayment;
	}

	public void setOrderPayment(OrderPayment orderPayment) {
		this.orderPayment = orderPayment;
	}

	public OrderSku getOrderSku() {
		return orderSku;
	}

	public void setOrderSku(OrderSku orderSku) {
		this.orderSku = orderSku;
	}
	
}
