package Accounts;

public class Controller {

	public static void main(String[] args) {
		Account acc = new Account(1,"Test", "This","12341");
		Account acc2 = new Account(2,"NUmber2", "NM2","8583");
		Account acc3 = new Account(2,"NUmber2", "NM2","8583");
		
		ServiceClass serviceReference = new ServiceClass();
		serviceReference.addAccount(acc);
		serviceReference.addAccount(acc2);
		serviceReference.addAccount(acc3);
	
		String accountJSON = serviceReference.convertToJSON();
		System.out.println(accountJSON);
		
		
		
	}

}
