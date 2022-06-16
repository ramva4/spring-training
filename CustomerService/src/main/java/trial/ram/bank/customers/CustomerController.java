package trial.ram.bank.customers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import trial.ram.bank.customers.domain.Customer;
import trial.ram.bank.customers.repository.CustomerRepository;

@RestController
@RequestMapping("/customers")
public class CustomerController {
	@Autowired
	CustomerRepository customerRepository;
	
	@GetMapping
	Collection<Customer> getCustomers() {
		return customerRepository.getAllCustomers();
	}
	
	@GetMapping("/{customerId}")
	Customer getCustomer(@PathVariable("customerId") String customerId) {
		return customerRepository.getCustomer(customerId);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	Customer putCustomer(@RequestBody Customer inCustomer) {
		return customerRepository.addCustomer(inCustomer);
	}
//List<Accounts>
}
