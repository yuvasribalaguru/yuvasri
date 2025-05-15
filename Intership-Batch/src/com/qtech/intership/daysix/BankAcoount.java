package com.qtech.intership.daysix;

public class BankAcoount {
	private int accountno;
	private double balance;
	public int getAccountno() {
		return accountno;
	}
	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public BankAcoount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BankAcoount(int accountno, double balance) {
		super();
		this.accountno = accountno;
		this.balance = balance;
	}
void  deposite(int amount) throws InvaliadAmountException{
	if(amount>deposit) {
		throw new InvaliadAmountException("OverLimit !!!");
	}else {
		balance = balance + amount;
	}
}
void withdraw(int amount)throws InsufficientFundException {
	if (balance<amount) {
		throw new InsufficientFundException("InsufficientFundException");
	}else {
		balance = balance - amount;
	}
}
	void displayBalance(double amount) {
		System.out.println("my current balnace is :"+ balance);
		
		
	}

public static void main(String[]args) {
	
}
	


	


		
		
	
		
	







