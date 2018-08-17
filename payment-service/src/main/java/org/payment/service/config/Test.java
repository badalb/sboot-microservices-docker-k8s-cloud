package org.payment.service.config;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Test {

	@Autowired
	private RabbitTemplate rabbitTemplate;

	@Autowired
	private RabbitMqMsgSender rabbitMqMsgSender;

	@Autowired
	private ApplicationConfigReader applicationConfig;

	@Scheduled(fixedDelay = 100, initialDelay = 50)
	public void sendMsg() {
		rabbitMqMsgSender.sendMessage(rabbitTemplate, applicationConfig.getAppExchange(),
				applicationConfig.getAppRoutingKey(), "Hello World");
	}

}
