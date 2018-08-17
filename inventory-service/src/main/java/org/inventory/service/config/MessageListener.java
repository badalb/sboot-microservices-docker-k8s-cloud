package org.inventory.service.config;

import org.springframework.amqp.AmqpRejectAndDontRequeueException;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageListener {

	@Autowired
	ApplicationConfigReader applicationConfigReader;

	@RabbitListener(queues = "${app.queue.name}")
	public void receiveMessageForApp1(final Object data) {

		try {
			System.out.println(data);
		} catch (Exception e) {
			throw new AmqpRejectAndDontRequeueException(e);
		}

	}

}
