package com.qtech.internship.daynine;

public interface Rentable {

	double calculateRental(int days) throws InvalidRentalException;

	void displayDetails();
	
}
