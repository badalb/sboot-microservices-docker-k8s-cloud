package org.payment.service.asyncorder;

import org.payment.service.model.OrderPaymentVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;

@Service
public class AsyncPublisherImpl implements AsyncPublisher {

	@Autowired
	private OrderStatusPublisher orderStatusPublisher;

	private Gson gson = new Gson();

	@Override
	@Async
	public void publishPaymentStatus(OrderPaymentVO orderPayment) {
		orderStatusPublisher.sendMsg(gson.toJson(orderPayment));
	}

}
