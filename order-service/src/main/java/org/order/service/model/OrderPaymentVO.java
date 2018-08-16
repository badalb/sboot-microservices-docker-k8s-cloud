package org.order.service.model;

import java.io.Serializable;

public class OrderPaymentVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3567241393224871980L;

	private Long paymentId;

	private Double amount;

	private String currency;

	public Long getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
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
