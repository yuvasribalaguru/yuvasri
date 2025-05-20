package com.qtech.internship.daynine;

public interface Interface {
	interface Rentalable{
		void displayDetails();
		double caluculateRental(int days)throws InvalidRentalException;
	}

}
