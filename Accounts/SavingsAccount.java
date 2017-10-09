
public class SavingsAccount extends Account {
	private double interestRate;
	
	public SavingsAccount() {
		balance = 50.0;
		interestRate = 0.0;
	}
	
	public void deposit (double amount) {
		interestRate = amount / 10;
		balance = amount + interestRate;
	}

}
