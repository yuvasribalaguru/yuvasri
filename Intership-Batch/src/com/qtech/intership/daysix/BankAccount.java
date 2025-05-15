package com.qtech.intership.daysix;

public class BankAccount {
	private int accountno;
	private double balance;
	public BankAccount(int accountno,double balance) {
		this.accountno=accountno;
		this.balance= balance;
		
	}
	public void deposit(double amount)throws InvalidException{
		if(amount<=0) {
			throw new InvalidException("Deposit amount must be positive");
		}
		balance += amount;
		System.out.println("Deposited:"+amount);
	}
	public void main withdraw(double amount)throws InvalidException{
		if(amount<=0) {
			throw new InvalidException("Wthidraw amount must be positive");
		}
		else if (amount>balance) {
			throw new InvalidException("Insufficient funds");
		}
		 balance-=amount;
		 System.out.print("Withdraw:"+amount);
		 
		}
	public void displayBalance() {
		System.out.println(accountno);
		
	}

public static void main(String[]args) {
	BankAccount=new BankAccount("Alice",1000);
	try {
		account.deposit(500);
		account.withdraw(200);
		account.withdraw(1500);
	}catch(InvalidException e) {
		System.out.println("Error:"+ e.getMessage());
	}
	account.dispalyBalance();
}
}
	
	
	


