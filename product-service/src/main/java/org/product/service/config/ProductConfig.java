package org.product.service.config;

import org.dozer.DozerBeanMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductConfig {

	@Bean("beanMapper")
	public DozerBeanMapper beanMapper() {
		DozerBeanMapper mapper = new DozerBeanMapper();
		return mapper;
	}

}
