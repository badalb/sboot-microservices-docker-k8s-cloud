package org.product.service.restapi;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.product.service.appservice.ProductService;
import org.product.service.domain.Price;
import org.product.service.domain.Product;
import org.product.service.invservice.client.InventoryServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@RunWith(SpringRunner.class)
@WebMvcTest(value = ProductRestApi.class, secure = false)
public class ProductRestApiTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private ProductService productService;

	@SpyBean
	private DozerBeanMapper beanMapper;

	@MockBean
	private InventoryServiceClient inventoryServiceClient;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testGetProduct() throws Exception {

		Product product = new Product();
		product.setId(1L);
		product.setName("Spring Boot in Action");
		product.setDescription("Spring Boot in Action");
		Price price = new Price();
		price.setAmount(44.99D);
		price.setCurrency("USD");
		product.setPrice(price);

		List<Product> products = new ArrayList<>();
		products.add(product);

		Mockito.when(productService.getProduct()).thenReturn(products);
		Mockito.when(inventoryServiceClient.getInventory(1L)).thenReturn(10);

		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/api/v1/products")
				.accept(MediaType.APPLICATION_JSON);

		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		System.out.println(result.getResponse());

	}

}
