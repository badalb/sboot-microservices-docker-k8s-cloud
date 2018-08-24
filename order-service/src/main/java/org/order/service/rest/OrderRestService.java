package org.order.service.rest;

import java.util.Optional;

import org.dozer.DozerBeanMapper;
import org.order.service.appservice.OrderService;
import org.order.service.domain.Order;
import org.order.service.model.OrderVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class OrderRestService {

	@Autowired
	private OrderService orderService;

	@Autowired
	private DozerBeanMapper beanMapper;

	@GetMapping("/orders/{orderId}")
	public @ResponseBody ResponseEntity<OrderVO> getProductInventory(@PathVariable String orderId) {
		Optional<Order> order = orderService.findOrder(orderId);
		OrderVO orderVo = new OrderVO();
		order.ifPresent(value -> {
			beanMapper.map(value, orderVo);
		});

		return new ResponseEntity<OrderVO>(orderVo, HttpStatus.OK);
	}

	@PostMapping("/orders")
	public @ResponseBody ResponseEntity<OrderVO> createOrder(@RequestBody OrderVO orderVo) {
		Order order = new Order();
		beanMapper.map(orderVo, order);
		Order savedOrder = orderService.createOrder(order);

		OrderVO createdOrderVo = new OrderVO();
		beanMapper.map(savedOrder, createdOrderVo);

		return new ResponseEntity<OrderVO>(createdOrderVo, HttpStatus.OK);
	}

}
