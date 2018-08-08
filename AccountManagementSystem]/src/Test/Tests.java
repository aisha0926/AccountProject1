package Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

import java.security.Provider.Service;

import org.junit.Test;

import Accounts.Account;
import Accounts.NewAccount;
import Accounts.ServiceClass;

public class Tests {

	@Test
	public void test() {
		Account addingAccount1 = new Account(1,"Bob","Marley","2");
		Account addingAccount2 = new Account(2,"Bob","Marley","3");
		Account addingAccount3 = new Account(3,"Bob","Marley","4");
		Account addingAccount4 = new Account(4,"Bob","Marley","5");
		Account addingAccount5 = new Account(5,"Ex","Marley","5");
		ServiceClass addingAccounts = new ServiceClass();
		addingAccounts.addAccount(addingAccount1);
		addingAccounts.addAccount(addingAccount2);
		addingAccounts.addAccount(addingAccount3);
		addingAccounts.addAccount(addingAccount4);
		addingAccounts.addAccount(addingAccount5);
		
		addingAccounts.cyclingThroughFirstName("Bob");
		assertEquals(4, addingAccounts.cyclingThroughFirstName("Bob"));
		assertEquals(5, addingAccounts.cyclingEveryEntryInHash());
		
	}
}
