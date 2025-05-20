package com.qtech.internship.daynine;

import java.util.Scanner;

public class VehicleRentalSystem {


	private static final int Type = 0;
	@SuppressWarnings("unused")
	private static String model;

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		Rentable[]vehicles = new Rentable[2];

		try {
			//first vehicle-car
			System.out.println("Enter Vehicle Type(1-Car,2-Bike):");
			int Type1 = sc.nextInt();
			System.out.println("Enter Vehicle ID:");
			int id1 = sc.nextInt();
			sc.nextLine();//consume newLine
			System.out.println("Enter Model:");
			String model1 = sc.nextLine();
			System.out.println("Enter Base Rate:");
			double rate1 = sc.nextDouble();
			if(Type1==1) {
				System.out.println("Enter car type:");
				String CarType = sc.nextLine();
				System.out.print("Enter Insurance Fee:");
				double insurance = sc.nextDouble();
				vehicles[0] = new Car();
				
			}
			//second vehicle - Bike
			System.out.println("Enter vehicle Type(1-car, 2-Bike):");
			Type1 = sc.nextInt();
			System.out.println("Enter vehicle ID:");
			id1 = sc.nextInt();
			System.out.println("Enter model:");
			model = sc.nextLine();
			System.out.println("Enter Base Rate:");
			Type1 = sc.nextInt();
			System.out.println("Enter vehicle ID:");
			id1 = sc .nextInt();
			System.out.println("Enter model:");
			model1 = sc.nextLine();
			System.out.println("Enter Base");
			rate1 = sc.nextDouble();
			
			
			
			if (Type ==2) {
				System.out.println("Enter Engine CC:");
				int CC = sc.nextInt();
				System.out.println("Enter helmet Rental Fee:");
				double helmetFee = sc.nextDouble();
				vehicles[1] = new Bike(id1, model1, rate1,CC, helmetFee);
					}
			System.out.println("Enter rental days for all vehicles:");
			int days = sc.nextInt();
			System.out.println("\n vehicle Rental Details---");
			
			for( Rentable v:vehicles) {
			
				v.displayDetails();
				double total =  v.calculateRental(days);
				System.out.println("Total Rental("+days+"days):"+total);
			}	
		}catch(InvalidRentalException e) {
			System.out.println(" Rental error:"+e.getMessage());
		}catch(Exception e) {
			System.out.println("InvalidRentalException:"+e.getMessage());
		}
		sc.close();
		}
	}
		
			
		
	
	


			
				
			
			
			
			
			
			
			
			
			
			
			
