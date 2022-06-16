package trial.ram.bank.domain;

public class Account {
	static int lastId;
	static {
		lastId = 200000;
	}

	public static String nextId() {
		return String.valueOf(lastId++);
	}

	String accountId;
	String customerId;
	Customer customer;

	public String getAccountId() {
		return accountId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
}
