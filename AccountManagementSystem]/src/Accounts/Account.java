package Accounts;

public class Account {
	private int id;
	private String fName;
	private String lName;
	private String accNumber;
	
	public Account() {
		
	}
	
	public Account(int iD,String firstName, String lastName, String accountNumber) {
		this.fName = firstName;
		this.lName = lastName;
		this.accNumber = accountNumber;
		this.id = iD;
	}
	

	public int getId() {
		return id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}
	
	@Override
	public String toString() {
		return "Account [id=" + id + ", fName=" + fName + ", lName=" + lName + ", accNumber=" + accNumber + "]";
	}
}
