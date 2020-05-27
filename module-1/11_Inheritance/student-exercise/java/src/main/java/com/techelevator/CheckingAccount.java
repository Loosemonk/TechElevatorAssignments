package com.techelevator;

public class CheckingAccount extends BankAccount {
	
	

	
	public CheckingAccount(String accountHolderName, String accountNumber, int balance) {
		super(accountHolderName, accountNumber, balance);
		
	}

	public CheckingAccount(String accountHolderName, String accountNumber) {
		super(accountHolderName, accountNumber);
	
	}

@Override
	public int withdraw(int amountToWithdraw) {
	if (amountToWithdraw >=  balance +100) {
		 return balance;
	}
	if (balance <= amountToWithdraw) {
		balance -= 10;
	}
		return balance -= amountToWithdraw;
		
	}	// Checking account can't be overdrawn by $100.00 or more. If a withdrawal request leaves the account $100 or more overdrawn, it fails and the balance remains the same.
	
	
		//if balance is less than $0 when the withdrawal was made, a $10 overdraft fee is also withdrawn from the account
	
	
	
	

}

