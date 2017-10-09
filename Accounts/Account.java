
public class Account {
	protected double balance;
	
	public Account(double startingBalance) {
		balance = startingBalance;
	}
	
	public Account() {
		balance = 0.0;
	}
	public void deposit(double amount) {
	    balance += amount;
	  }
	public void withdraw(double amount) {
	    balance -= amount;
	  }
	public void displayBalance() {
	    System.out.println("Balance: " + balance);
	  }
	
}
