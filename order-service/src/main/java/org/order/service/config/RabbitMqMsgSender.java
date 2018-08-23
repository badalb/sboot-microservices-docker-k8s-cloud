package org.order.service.config;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Component
public class RabbitMqMsgSender {

	public void sendMessage(RabbitTemplate rabbitTemplate, String exchange, String routingKey, Object data) {
		rabbitTemplate.convertAndSend(exchange, routingKey, data);
	}
}
