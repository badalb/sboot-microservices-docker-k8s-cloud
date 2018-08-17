package org.product.service.restapi;

import java.util.List;
import java.util.stream.Collectors;

import org.dozer.DozerBeanMapper;
import org.product.service.appservice.ProductService;
import org.product.service.domain.Product;
import org.product.service.invservice.client.InventoryServiceClient;
import org.product.service.model.ProductVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ProductRestApi {

	@Autowired
	private ProductService productService;

	@Autowired
	private DozerBeanMapper beanMapper;
	
	@Autowired
	private InventoryServiceClient inventoryServiceClient;

	@GetMapping("/products")
	public @ResponseBody ResponseEntity<List<ProductVO>> getProduct() {

		List<Product> products = productService.getProduct();
		List<ProductVO> productVoList = products.stream().map(product -> beanMapper.map(product, ProductVO.class))
				.collect(Collectors.toList());
		//for(Product p: products) {
			Integer inv = inventoryServiceClient.getInventory(1L);
			System.out.println(inv);
		//}
		
		return new ResponseEntity<List<ProductVO>>(productVoList, HttpStatus.OK);

	}
}
