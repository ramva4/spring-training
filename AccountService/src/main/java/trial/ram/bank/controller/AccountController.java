package trial.ram.bank.controller;

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

import trial.ram.bank.domain.Account;
import trial.ram.bank.repository.AccountRepository;

@RestController
@RequestMapping("/accounts")
public class AccountController {
	@Autowired
	AccountRepository accountRepository;
	
	@GetMapping
	Collection<Account> getAccounts() {
		return accountRepository.getAllAccounts();
	}
	
	@GetMapping("/{accountId}")
	Account getAccount(@PathVariable("accountId") String accountId) {
		return accountRepository.getAccount(accountId);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	Account putAccount(@RequestBody Account inAccount) {
		return accountRepository.addAccount(inAccount);
	}
//List<Accounts>

}
