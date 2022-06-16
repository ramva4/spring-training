package trial.ram.bank.controller;

import java.util.Collection;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import trial.ram.bank.domain.Account;

@RestController
@RequestMapping("/accounts")
public class AccountController {
	@GetMapping
	Collection<Account> getAccounts() {
		return Account.accounts.values();
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	Account putAccount(@RequestBody Account inAccount) {
		//Account account = new Account();
		return null;
		//return Account.accounts.values();
	}
//List<Accounts>

}
