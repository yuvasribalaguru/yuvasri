package com.qtech.intership.dayfour;

public class ConstructorOverloading {
	//Default Constructor
	public ConstructorOverloading() {
		System.out.println("default constructor");
	}
	int ConstructorOverloading(int a,int b) {
		return a+b;
	}
	int ConstructorOverloading(int a) {
		return a;
	}
		public static void main(String[]args) {
			ConstructorOverloading c =new ConstructorOverloading();
     		c.ConstructorOverloading(23,56);
			c.ConstructorOverloading(64);
			
			}
}
		
	
