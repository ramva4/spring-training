package trial.ram.bank.domain;

import java.util.HashMap;

public class Account {
	static int lastId;
	public static final HashMap<String,Account> accounts;

	static {
		accounts = new HashMap<>();
	}
	
	static int nextId() {
		return lastId++;
	}

	public Account() {
		custId = String.valueOf(Account.nextId());
		accounts.put(custId, this);
	}
	
	String custId;
	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	String custName;
}
