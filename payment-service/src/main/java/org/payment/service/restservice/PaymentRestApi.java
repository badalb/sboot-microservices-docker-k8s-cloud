package org.payment.service.restservice;

import java.util.Optional;

import org.dozer.DozerBeanMapper;
import org.payment.service.applservice.PaymentService;
import org.payment.service.asyncorder.AsyncPublisher;
import org.payment.service.domain.Payment;
import org.payment.service.model.OrderPaymentVO;
import org.payment.service.model.PaymentVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class PaymentRestApi {

	@Autowired
	private PaymentService paymentService;

	@Autowired
	private DozerBeanMapper beanMapper;

	@Autowired
	private AsyncPublisher asyncPublisher;

	@GetMapping("/payments/{id}")
	public @ResponseBody ResponseEntity<PaymentVO> getPaymentDetails(@PathVariable Long id) {

		Optional<Payment> payment = paymentService.getPaymentDetails(id);
		PaymentVO paymentVO = new PaymentVO();
		payment.ifPresent(value -> {
			beanMapper.map(value, paymentVO);
		});
		return new ResponseEntity<PaymentVO>(paymentVO, HttpStatus.OK);

	}

	@PostMapping("/payments")
	public @ResponseBody ResponseEntity<PaymentVO> makePayment(@RequestBody PaymentVO paymentVO) {

		Payment payment = new Payment();
		beanMapper.map(paymentVO, payment);
		Payment actualPayment = paymentService.makePayment(payment);
		PaymentVO actulaPaymentVO = new PaymentVO();
		beanMapper.map(actualPayment, actulaPaymentVO);

		asyncPublisher
				.publishPaymentStatus(new OrderPaymentVO(actualPayment.getOrderId(), actualPayment.getId(), "Success"));

		return new ResponseEntity<PaymentVO>(actulaPaymentVO, HttpStatus.OK);
	}
}
