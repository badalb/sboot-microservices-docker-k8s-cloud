package org.product.service.config;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.github.mongobee.Mongobee;

@Configuration
public class ProductConfig {
	
	@Autowired
	private MongoTemplate mongoTemplate;

	@Bean("beanMapper")
	public DozerBeanMapper beanMapper() {
		DozerBeanMapper mapper = new DozerBeanMapper();
		return mapper;
	}

	@Bean
	public Mongobee mongobee(){
	  Mongobee runner = new Mongobee("mongodb://localhost:27017/products");
	  runner.setDbName("products");
	  runner.setChangeLogsScanPackage(
	       "org.product.service.products"); 
	  runner.setMongoTemplate(mongoTemplate);
	  
	  return runner;
	}
}
