package trial.ram.bank.customers.domain;

public class Customer {
	static int lastId;
	String customerName;
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	String customerId;
	
	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	static {
		lastId = 100;
	}

	public static String nextId() {
		return String.format("C%d", lastId++);
	}

	public Customer() {
	}
}
