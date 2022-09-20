package gmc.learning.thymeleaf.service;

import java.util.List;

import gmc.learning.thymeleaf.entity.Customer;

public interface CustomerService {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

	public void deleteCustomer(int theId);
	
}
