package org.payment.service.applservice;

import java.util.Optional;

import org.payment.service.domain.Payment;

public interface PaymentService {

	public Optional<Payment> getPaymentDetails(Long paymentId);
}
