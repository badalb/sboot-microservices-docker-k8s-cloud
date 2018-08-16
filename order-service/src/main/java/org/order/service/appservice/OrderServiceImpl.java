package org.order.service.appservice;

import java.util.Optional;

import org.order.service.domain.Order;
import org.order.service.persistence.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void createOrder(Order order) {
		orderRepository.save(order);
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

}
