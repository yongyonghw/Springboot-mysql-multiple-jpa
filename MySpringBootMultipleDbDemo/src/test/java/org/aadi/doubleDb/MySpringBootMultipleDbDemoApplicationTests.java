package org.aadi.doubleDb;

import org.aadi.doubleDb.model.customer.Customer;
import org.aadi.doubleDb.repo.customer.CustomerRepository;
import org.aadi.doubleDb.repo.product.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MySpringBootMultipleDbDemoApplicationTests {
	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private ProductRepository productRepository;


	@Test
	void contextLoads() {

		Customer customer = new Customer();
		customer.setCname("test");
		customer.setId(1);

		customerRepository.save(customer);

	}

}
