package org.payment.service.domain;

public enum PaymentStatus {

	PAID("Payment received"), UNPAID("Payment not received");

	private String paymentStatus;

	PaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

}
