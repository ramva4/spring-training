package trial.ram.bank.domain;

public class Account {
	static int lastId;
	String accountId;
	String customerId;
	Customer customer;
	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

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
		lastId = 100000;
	}

	public static String nextId() {
		return String.valueOf(lastId++);
	}
}
