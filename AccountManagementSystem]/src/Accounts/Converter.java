package Accounts;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Converter {
	
	

	public static String convertToJSON(int id) {
		ServiceClass gettingAccount = new ServiceClass();
		Gson gson = new Gson();
		GsonBuilder builder = new GsonBuilder();
	    builder.setPrettyPrinting();
	    gson = builder.create(); 
	    String jsonStr = gson.toJson(gettingAccount.getAccount(id));   
	    System.out.println(jsonStr);
	    return jsonStr;
	}
	
	public static void main(String[] args) {
		convertToJSON(1);
	}
}
