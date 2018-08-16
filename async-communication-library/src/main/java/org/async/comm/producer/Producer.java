package org.async.comm.producer;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Producer {

	@Autowired
	private AmqpTemplate amqpTemplate;

	@Value("${k8s.rabbitmq.exchange}")
	private String exchange;

	public void produceMsg(String msg, String routingKey) {
		amqpTemplate.convertAndSend(exchange, routingKey, msg);
		System.out.println("Send msg = " + msg);
	}
}
