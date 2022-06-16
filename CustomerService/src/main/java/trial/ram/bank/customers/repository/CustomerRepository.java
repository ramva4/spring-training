package trial.ram.bank.customers.repository;

import java.util.Collection;
import java.util.HashMap;

import org.springframework.stereotype.Component;

import trial.ram.bank.customers.domain.Customer;

@Component
public class CustomerRepository {
	public HashMap<String, Customer> customers;
	
	public CustomerRepository() {
		customers = new HashMap<>();
	}
	
	public Customer addCustomer(Customer customer) {
		customer.setCustomerId(Customer.nextId());
		return customers.put(customer.getCustomerId(), customer);
	}
	
	public Customer getCustomer(String customerId) {
		return customers.get(customerId);
	}
	
	public Collection<Customer> getAllCustomers() {
		return customers.values();
	}
}
