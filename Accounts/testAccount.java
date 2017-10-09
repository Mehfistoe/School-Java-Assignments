import java.util.Scanner;

public class testAccount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome. Which account do you want to create? \n 1. Normal \t 2. Savings");
		System.out.print("Enter choice: ");
		int choice = sc.nextInt();
		Account acct = null;
		if (choice == 1) {
			acct = new Account();
			System.out.println("New normal account created.");
			acct.displayBalance();
		} else if (choice == 2) {
			//Create savings account here by checking the initial balance			
			System.out.println("How much initial balance (Must be > $50)?");
			double amount = sc.nextDouble();
			while (true) {
				if (amount >= 50){
					acct = new SavingsAccount();
					//Deposit money to account here
					acct.deposit(amount);
					acct.displayBalance();
					break;
				}
				System.out.println("Must be $50 or more.");
				amount = sc.nextDouble();
			}
		}
	}
}
