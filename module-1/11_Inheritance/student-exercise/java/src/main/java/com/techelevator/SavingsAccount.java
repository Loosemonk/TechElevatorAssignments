package com.techelevator;

public class SavingsAccount extends BankAccount {

	public SavingsAccount(String accountHolderName, String accountNumber, int balance) {
		super(accountHolderName, accountNumber, balance);
		// TODO Auto-generated constructor stub
	}

	public SavingsAccount(String accountHolderName, String accountNumber) {
		super(accountHolderName, accountNumber);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int withdraw(int amountToWithdraw) {
		if (balance < amountToWithdraw) {
			return balance;
		} else {
			if (balance - amountToWithdraw < 150) {
				amountToWithdraw+=2;
			}
		}
	return super.withdraw(amountToWithdraw);
	}	
	// if the withdrawal is requested for more than the current balance, the withdrawal fails and the balance remains the same.

	
}
