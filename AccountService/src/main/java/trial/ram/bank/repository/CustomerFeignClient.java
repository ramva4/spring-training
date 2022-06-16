package trial.ram.bank.repository;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import trial.ram.bank.domain.Customer;

@FeignClient(name = "customerFeignClient", url = "http://localhost:8091/customers")
public interface CustomerFeignClient {
	//@RequestMapping("/", method = RequestMethod.GET)
	@GetMapping("/{customerId}")
    Customer getCustomer(@PathVariable String customerId);	
}
