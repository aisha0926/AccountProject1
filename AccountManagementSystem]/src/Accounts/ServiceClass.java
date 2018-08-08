package Accounts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ServiceClass {

	private Map<Integer, Account> accounts;
	
	public ServiceClass() {
		accounts = new HashMap<Integer, Account>();

	}

	public void addAccount(Account id) {
		accounts.put(id.getId(), id);
	}

	public void removeAcc(int id) {
		accounts.remove(id);
	}

	public Account getAccount(int id) {

		return this.accounts.get(id);
	}

	public void updateAccount() {

		Account acc = new Account();
		for (Integer key : accounts.keySet()) {
			if (key.equals(acc.getId())) {
				acc.setfName("TEST");
				acc.setlName("TEST");
			}
		}
	}

	public Account retrievingMap(Account id) {
		Account acc = new Account();
		for (Integer key : accounts.keySet()) {
			if (key.equals(id.getId())) {
				acc.getId();
				acc.getfName();
				acc.getlName();
			}
		}
		return acc;

	}

	public String convertToJSON(int id) {
		// ServiceClass gettingAccount = new ServiceClass();
		Gson gson = new Gson();
		GsonBuilder builder = new GsonBuilder();
		builder.setPrettyPrinting();
		gson = builder.create();
		String jsonStr = gson.toJson(getAccount(id));
		return jsonStr;
	}

	public String convertToJSON() {
		// ServiceClass gettingAccount = new ServiceClass();
		Gson gson = new Gson();
		GsonBuilder builder = new GsonBuilder();
		builder.setPrettyPrinting();
		gson = builder.create();
		String jsonStr = gson.toJson(accounts);
		return jsonStr;
	}

	public String convertJSONToJava() {
		return null;
	}

	public int cycle() {
		int count = 0;

		for(Integer key : accounts.keySet()) {
			count+=key;
		}
		
		return count;
	}

}
