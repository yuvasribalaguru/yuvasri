package com.qtech.intership.daysix;
public class BankAcoount {
	private int accno;
	private double balance;
	public BankAcoount(int accno, double initialBalance) {
		this.accno=accno;
		this.balance=initialBalance;
	}
		public BankAcoount() {
			super();
			// TODO Auto-generated constructor stub
		
	}
		
	
	public void deposit(double amount)throws InvalidAmountException {
		if(amount<=0) {
			throw new InvalidAmountException("Deposit amount must be positive:");
		}
		else {
			balance=balance+amount;
			System.out.println("Deposited:"+amount);
		}
	}
	public void withdraw(double amount)throws InvalidAmountException {
		if(amount<=0) {
			throw new InvalidAmountException("withdraw amount must be lessthan amount:");
		}
		else {
			balance=balance-amount;
			System.out.println("withdraw:"+amount);
		}
	}
	public void displayBalance() {
		System.out.println("current balance:"+balance);
	}
	public static void main(String[] args) {
		BankAcoount account=new BankAcoount();
		try {
			account.deposit(500);
			account.withdraw(300);
			account.withdraw(2000);
		}catch(InvalidAmountException e) {
			System.out.println("transaction error:"+e.getMessage());
		}
	}
	
}


	


		
		
	
		
	







