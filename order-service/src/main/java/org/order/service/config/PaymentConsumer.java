package org.order.service.config;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class PaymentConsumer {

	@RabbitListener(queues = "${app.queue.name}")
	public void recievedMessage(Object msg) {
		System.out.println("In payment consumer ....");
		System.out.println("Received Message .... " + msg.toString());
	}
}