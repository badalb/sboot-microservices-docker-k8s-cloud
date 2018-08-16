package org.payment.service.applservice;

import java.util.Optional;

import org.payment.service.domain.Payment;
import org.payment.service.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

	@Autowired
	private PaymentRepository paymentRepository;

	@Override
	public Optional<Payment> getPaymentDetails(Long paymentId) {
		return paymentRepository.findById(paymentId);
	}

}
