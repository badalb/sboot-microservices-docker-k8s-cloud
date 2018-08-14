package org.order.service.domain;

public enum OrderStatus {

	UNPAID("UNPAID"), PAID("PAID");

	private String paymentStatus;

	public String getPaymentStatus() {
		return paymentStatus;
	}

	OrderStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

}
