package banking;

public class Customer {
	private String firstName; //Declare three private object attributes: firstName, lastName and account. 
	private String lastName;
	Account account;
	public Customer(String f,String l){//Declare a public constructor that takes two parameters 
		this.firstName=f;
		this.lastName=l;
	}
	public String getFirstName() {//Declare a public accessor methods for firstName
		return firstName;
	}
	public String getLastName() {//Declare a public accessor methods for lastName
		return lastName;
	}
	public Account getAccount() {//Declare a public accessor methods for account
		return account;
	}
	public void setAccount(Account acct) {//Declare a public mutator methods for account
		this.account=acct;
	}
}
