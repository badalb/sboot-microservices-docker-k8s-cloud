package org.payment.service.restservice;

import java.util.Optional;

import org.dozer.DozerBeanMapper;
import org.payment.service.applservice.PaymentService;
import org.payment.service.domain.Payment;
import org.payment.service.model.PaymentVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

	@GetMapping("/payments/{id}")
	public @ResponseBody ResponseEntity<PaymentVO> getPaymentDetails(@PathVariable Long id) {

		Optional<Payment> payment = paymentService.getPaymentDetails(id);
		PaymentVO paymentVO = new PaymentVO();
		payment.ifPresent(value -> {
			beanMapper.map(value, paymentVO);
		});
		return new ResponseEntity<PaymentVO>(paymentVO, HttpStatus.OK);

	}

}
