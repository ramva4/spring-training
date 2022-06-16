package trial.ram.bank.repository;

import java.util.Collection;
import java.util.HashMap;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

import trial.ram.bank.domain.Account;

@Component
public class AccountRepository {
	public HashMap<String, Account> accounts;
	
	public AccountRepository() {
		accounts = new HashMap<>();
	}
	
	public Account addAccount(Account account) {
		account.setAccountId(Account.nextId());
		return accounts.put(account.getAccountId(), account);
	}
	
	
	public Account getAccount(String accountId) {
		return accounts.get(accountId);
	}
	
	public Collection<Account> getAllAccounts() {
		return accounts.values();
	}
}
