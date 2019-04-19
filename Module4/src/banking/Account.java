package banking;

public class Account {
	private double balance;  //Declare a private object attribute balance
	public Account(double init_balance) {//Declare a public constructor 
		this.balance=init_balance;
	}
	public double getBalance() {   //Declare a public accessor methods for balance
		return balance;
	}
	public boolean deposit(double amt) {//Declare a public methods for deposit
		balance=balance+amt;
		return true;
	}
	public boolean withdraw(double amt) {//Declare a public methods for withdraw
		//Check the if amount being withdraw is greater than balance or not
		if(balance-amt>=0) {  
			balance=balance-amt;
			//if amt less than balance return true and subtract the amount from the balance
			return true;
		}else {
			return false;//else return false
		}
		
	}
}
