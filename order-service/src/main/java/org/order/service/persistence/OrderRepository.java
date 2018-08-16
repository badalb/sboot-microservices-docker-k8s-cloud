package org.order.service.persistence;

import java.util.Optional;

import org.order.service.domain.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {

	Optional<Order> findByOrderId(String orderId);

}
