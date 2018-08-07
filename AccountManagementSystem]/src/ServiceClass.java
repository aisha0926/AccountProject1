import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ServiceClass {

	public static void main(String args[]) {
		Map<Object, String> accounts = new HashMap<Object, String>();
		
		Account acc = new Account("Test", "This","12341");
		Account acc2 = new Account("NUmber2", "NM2","8583");
		accounts.put(acc, "Name");
		accounts.put(acc2, "Number3");
		
		System.out.println(accounts.size());
		
		for(Object key: accounts.keySet()) {
			
		}
		

	}
	
}
