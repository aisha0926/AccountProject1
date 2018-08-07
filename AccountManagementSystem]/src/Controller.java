
public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc = new Account(1,"Test", "This","12341");
		Account acc2 = new Account(2,"NUmber2", "NM2","8583");
		
		ServiceClass a = new ServiceClass();
		a.addAccount(acc);
		a.addAccount(acc2);
		
		Account ab = a.getAccount(1);
		
		System.out.println(ab.toString());
		
	}

}
