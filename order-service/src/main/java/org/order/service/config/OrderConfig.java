package org.order.service.config;

import org.dozer.DozerBeanMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OrderConfig {

	@Bean("beanMapper")
	public DozerBeanMapper beanMapper() {
		DozerBeanMapper mapper = new DozerBeanMapper();
		return mapper;
	}

}
