package gmc.learning.thymeleaf.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import gmc.learning.thymeleaf.dao.CustomerDAO;
import gmc.learning.thymeleaf.entity.Customer;

@Component
public class CustomerBootstrap implements ApplicationListener<ContextRefreshedEvent>{
	
	@Autowired
	private CustomerDAO customerDAO;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		Customer cust1 = new Customer();
		cust1.setId(1);
		cust1.setFirstName("Balachander");
		cust1.setEmail("smnavin65@gmail.com");
		cust1.setLastName("Sivalingam");
		customerDAO.save(cust1);
	}

	
}
