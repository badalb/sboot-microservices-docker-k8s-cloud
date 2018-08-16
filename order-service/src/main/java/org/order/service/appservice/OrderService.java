package org.order.service.appservice;

import java.util.Optional;

import org.order.service.domain.Order;

public interface OrderService {

	public void createOrder(Order order);

	public void updateOrder(Order order);

	public void deleteOrder(Long orderId);

	public Optional<Order> findOrder(String orderId);
}
