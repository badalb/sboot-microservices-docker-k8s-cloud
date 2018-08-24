package org.product.service.products;

import java.util.Date;

import org.product.service.domain.Price;
import org.product.service.domain.Product;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.github.mongobee.changeset.ChangeLog;
import com.github.mongobee.changeset.ChangeSet;

@ChangeLog
public class DatabaseChangelog {

	@ChangeSet(order = "001", id = "create_products", author = "system")
	public void importantWorkToDo(MongoTemplate mongoTemplate) {

		Product product = new Product();
		product.setCreatedBy("System");
		product.setId(100L);
		product.setCreatedDate(new Date());
		product.setDescription("Spring in Action V5");
		product.setName("Spring in Action");
		Price price = new Price();
		price.setAmount(35.5D);
		price.setCurrency("USD");
		product.setPrice(price);

		mongoTemplate.save(product);
	}

}