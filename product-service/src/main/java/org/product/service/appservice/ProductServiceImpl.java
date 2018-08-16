package org.product.service.appservice;

import java.util.List;

import org.product.service.domain.Product;
import org.product.service.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<Product> getProduct() {
		return productRepository.findAll();
	}

}
