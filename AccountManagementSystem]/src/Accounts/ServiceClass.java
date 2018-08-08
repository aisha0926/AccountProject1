package Accounts;

import java.util.HashMap;
import java.util.Map;

public class ServiceClass {

	Map<Integer, Account> accounts = new HashMap<Integer, Account>();

	public ServiceClass() {

	}

	public void addAccount(Account a) {
		accounts.put(a.getId(), a);
	}

	public void removeAcc(int id) {
		accounts.remove(id);
	}

	public Account getAccount(int id) {

		return this.accounts.get(id);
	}
}
