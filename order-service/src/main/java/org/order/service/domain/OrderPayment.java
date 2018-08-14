package org.order.service.domain;

import java.io.Serializable;

public class OrderPayment implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long orderPaymentId;

	private Long paymentId;

	private Order order;

	private Double amount;

	private String currency;

	public Long getOrderPaymentId() {
		return orderPaymentId;
	}

	public void setOrderPaymentId(Long orderPaymentId) {
		this.orderPaymentId = orderPaymentId;
	}

	public Long getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

}
