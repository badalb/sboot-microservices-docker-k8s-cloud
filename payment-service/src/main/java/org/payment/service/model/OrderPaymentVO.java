package org.payment.service.model;

import java.io.Serializable;

public class OrderPaymentVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1757114329344030682L;

	private Long orderId;

	private Long paymentId;

	private String paymentStatus;

	public OrderPaymentVO() {
		super();
	}

	public OrderPaymentVO(Long orderId, Long paymentId, String paymentStatus) {
		super();
		this.orderId = orderId;
		this.paymentId = paymentId;
		this.paymentStatus = paymentStatus;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
}
