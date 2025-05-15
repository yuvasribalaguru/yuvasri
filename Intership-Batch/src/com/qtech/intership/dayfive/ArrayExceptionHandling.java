package com.qtech.intership.dayfive;

public class ArrayExceptionHandling {
	public static void main(String[]args) {
		int [] numbers = {1,2,3};
		try {
			int x = numbers [5];
			System.out.println("Value at index 5:"+x);
			}
		catch(ArrayIndexOutOfBoundsException e)	{
			System.out.println("Error:Array index is out of bounds."+e.getMessage());
		
		}
		finally {
			System.out.println("This block always executes");
		}
		System.out.println("Program continues after exception handling");
		}
}
