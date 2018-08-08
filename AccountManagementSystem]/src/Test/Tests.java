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
		Account acc1 = new Account(1,"Bob","Marley","2");
		Account acc2 = new Account(2,"Bob","Marley","3");
		Account acc3 = new Account(3,"Bob","Marley","4");
		Account acc4 = new Account(4,"Bob","Marley","5");
		Account acc5 = new Account(5,"Ex","Marley","5");
		ServiceClass service = new ServiceClass();
		service.addAccount(acc1);
		service.addAccount(acc2);
		service.addAccount(acc3);
		service.addAccount(acc4);
		service.addAccount(acc5);
		
		//System.out.println(service.cycle());
		//System.out.println(service.cyclingThroughFirstName("Bob"));
		//service.cyclingThroughFirstName("Bob");
		service.cyclingThrough("Bob");
		assertEquals(4, service.cyclingThrough("Bob"));
		assertEquals(5, service.cycle());
		
	}
}
