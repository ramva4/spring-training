package trial.ram.bank.repository;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import trial.ram.bank.domain.Customer;

@FeignClient(name = "customers")
//, url = "http://CUSTOMERS/customers")
public interface CustomerFeignClient {
	//@RequestMapping("/", method = RequestMethod.GET)
	@GetMapping("/customers/{customerId}")
    Customer getCustomer(@PathVariable String customerId);	
}
