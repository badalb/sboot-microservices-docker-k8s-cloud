package org.order.service.paymentconsumer;

import org.order.service.appservice.OrderService;
import org.order.service.model.OrderPaymentVO;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;

@Component
public class PaymentConsumer {

	@Autowired
	private OrderService orderService;

	private Gson gson = new Gson();

	@RabbitListener(queues = "${app.queue.name}")
	public void recievedMessage(String msg) {
		OrderPaymentVO paymentVO = gson.fromJson(msg, OrderPaymentVO.class);
		orderService.updateOrderStatus(paymentVO.getOrderId(), paymentVO.getPaymentId(), paymentVO.getPaymentStatus());
	}
}