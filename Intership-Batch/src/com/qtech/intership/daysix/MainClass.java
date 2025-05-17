package com.qtech.intership.daysix;

public class MainClass{
	public static void main(String[]args) {
		BankAcoount account= new BankAcoount();
		try {
			account.deposit(500);
		}catch (InvalidAmountException e) {
			System.out.println("Transction error"+e.getMessage());
	
		}
		account.displayBalance();
			
		
		
	}
	
}
	
	
	


 