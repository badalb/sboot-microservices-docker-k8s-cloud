package org.order.service.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.order.service.domain.OrderStatus;

public class OrderVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8477740511599522216L;

	private Long id;

	private OrderStatus orderStatus;

	@OneToOne(mappedBy = "order")
	private OrderPaymentVO orderPayment;

	@OneToMany(mappedBy = "order")
	private List<OrderSkuVO> orderSkus;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}

	public OrderPaymentVO getOrderPayment() {
		return orderPayment;
	}

	public void setOrderPayment(OrderPaymentVO orderPayment) {
		this.orderPayment = orderPayment;
	}

	public List<OrderSkuVO> getOrderSkus() {
		return orderSkus;
	}

	public void setOrderSkus(List<OrderSkuVO> orderSkus) {
		this.orderSkus = orderSkus;
	}

}
