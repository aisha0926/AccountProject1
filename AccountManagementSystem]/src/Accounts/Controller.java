package Accounts;

public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc = new Account(1,"Test", "This","12341");
		Account acc2 = new Account(2,"NUmber2", "NM2","8583");
		
		ServiceClass serviceReference = new ServiceClass();
		serviceReference.addAccount(acc);
		serviceReference.addAccount(acc2);
	
		serviceReference.addAccount(acc);
		serviceReference.addAccount(acc);
		String accountJSON = serviceReference.convertToJSON(1);
		System.out.println(accountJSON);
	}

}
