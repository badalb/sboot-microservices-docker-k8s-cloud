package org.payment.service.model;

import java.io.Serializable;

import org.payment.service.domain.PaymentStatus;

public class PaymentVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7582194237047333759L;
	

	private Long orderId;

	private PaymentStatus paymentStatus;

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public PaymentStatus getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(PaymentStatus paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	

}
