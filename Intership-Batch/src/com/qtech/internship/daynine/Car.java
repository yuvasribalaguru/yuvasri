package com.qtech.internship.daynine;

public class Car implements Rentable  {
	private String carType;
	private double insuranceFee;
	public void car(int vehicleId, String model, double baseRate, String carType, double insuranceFee) {
		this.carType = carType;
		this.insuranceFee = insuranceFee;
	
	}
	public double calculateRental(int days)throws InvalidRentalException{
		if(days<=0)throw new InvalidRentalException("Rental days must be greater than zero");
		return getBaseRate()*days+ insuranceFee;
		
	}

	private int getBaseRate() {
		// TODO Auto-generated method stub
		return 0;
	}
	public void displayDetails() {
		//super.displayDetails();
		System.out.println("car Type:" + carType);
}
}