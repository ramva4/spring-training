package trial.ram.bank.domain;

public class Account {
	static int lastId;
	String accountId;
	String customerId;
	
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	static {
		lastId = 400000;
	}

	public static String nextId() {
		return String.valueOf(lastId++);
	}

	public Account() {
		accountId = String.valueOf(Account.nextId());
	}
}
