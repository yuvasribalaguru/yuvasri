package com.qtech.internship.daynine;



 class  Bike extends Vehicle{
	private int engineCC;
	private double helmetRentalFee;
	public Bike(int vehicleId , String model, double baseRate, int enginCC, double helmetRentalFee) {
		super(enginCC, model, helmetRentalFee);
		
			
			this.engineCC = enginCC;
			this.helmetRentalFee = helmetRentalFee;
		}
	
		public double calculateRental(int days) throws InvalidRentalException{
			if(days<=0)throw new InvalidRentalException("Rental days must be greater than zero");
			double helmetRentalFee = 0;
			return baseRate( )* days + helmetRentalFee;
		}
		public void displayDetails() {
			super. displayDetails();
		
			System.out.println("EngineCC:" + engineCC);
		}

 }
