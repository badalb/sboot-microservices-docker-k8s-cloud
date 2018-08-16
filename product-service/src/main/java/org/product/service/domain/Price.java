package org.product.service.domain;

import java.io.Serializable;

public class Price implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6235686345188213135L;
	
	private Double amount;
	
	private String currency;

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
