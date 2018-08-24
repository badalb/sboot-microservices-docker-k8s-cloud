package org.payment.service.asyncorder;

import org.payment.service.config.ApplicationConfigReader;
import org.payment.service.config.RabbitMqMsgSender;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class OrderStatusPublisher {

	@Autowired
	private RabbitTemplate rabbitTemplate;

	@Autowired
	private RabbitMqMsgSender rabbitMqMsgSender;

	@Autowired
	private ApplicationConfigReader applicationConfig;

	@Scheduled(fixedDelay = 100, initialDelay = 50)
	public void sendMsg(Object object) {
		rabbitMqMsgSender.sendMessage(rabbitTemplate, applicationConfig.getAppExchange(),
				applicationConfig.getAppRoutingKey(), "Hello World");
	}

}
