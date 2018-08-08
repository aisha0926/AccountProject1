package Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

import java.security.Provider.Service;

import org.junit.Test;

import Accounts.Account;
import Accounts.ServiceClass;

public class Tests {

	@Test
	public void test() {
		NewAccount acc1 = new NewAccount(1,"Bob","Marley","1234");
		Account acc2 = new Account(2,"Bob","Marley","1235");
		Account acc3 = new Account(3,"Bob","Marley","1234");
		Service service = new Service();
		service.addAccount(acc1);
		service.addAccount(acc2);
		service.cycle();
		
		System.out.println(service.cycle.toString);
		
		assertEquals(3, service.cycle.toString);

	}
}
