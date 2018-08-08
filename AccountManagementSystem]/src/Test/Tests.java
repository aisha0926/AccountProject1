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
		Account acc1 = new Account(3,"Bob","Marley","1234");
		Account acc2 = new Account(3,"Bob","Marley","1234");
		Account acc3 = new Account(3,"Bob","Marley","1234");
		Account acc4 = new Account(3,"Bob","Marley","1234");
		ServiceClass service = new ServiceClass();
		service.addAccount(acc1);
		service.addAccount(acc2);
		service.addAccount(acc3);
		service.addAccount(acc4);
		service.cycle();
		
		System.out.println(service.cycle());
		
		assertEquals(3, service.cycle());
	}
}
