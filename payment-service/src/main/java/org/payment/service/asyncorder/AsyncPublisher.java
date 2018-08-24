package org.payment.service.asyncorder;

import org.payment.service.model.OrderPaymentVO;

public interface AsyncPublisher {

	public void publishPaymentStatus(OrderPaymentVO orderPayment);
}
