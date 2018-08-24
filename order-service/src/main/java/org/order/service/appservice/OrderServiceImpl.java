package org.order.service.appservice;

import java.util.Optional;

import javax.transaction.Transactional;

import org.order.service.domain.Order;
import org.order.service.domain.OrderPayment;
import org.order.service.persistence.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderRepository;

	@Override
	public Order createOrder(Order order) {
		return orderRepository.save(order);
	}

	@Override
	public void updateOrder(Order order) {
		orderRepository.save(order);
	}

	@Override
	public void deleteOrder(Long orderId) {
		orderRepository.deleteById(orderId);
	}

	@Override
	public Optional<Order> findOrder(String orderId) {
		return orderRepository.findByOrderId(orderId);
	}

	@Override
	public void updateOrderStatus(String oderId, Long paymentId, String status) {

		Optional<Order> order = orderRepository.findByOrderId(oderId);
		OrderPayment payment = new OrderPayment();
		payment.setId(paymentId);
		order.ifPresent(o -> {
			payment.setOrder(o);
			o.setOrderPayment(payment);
			orderRepository.save(o);
		});
	}

}
