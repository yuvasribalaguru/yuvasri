package com.qtech.dayeight;


 public class PhDStudent  extends Student{
	
	
	public PhDStudent(String StudentId, String name, String department, double  gpa)throws InvalidGPAException{
		super(StudentId, name,department, gpa);
		
			
	}
	public void calculateGrade() {
		//GPA already represent grade for simplicity
	
		}
	
	public boolean isPassed() {
		return getGPA()>=3.0;
		
	}
	 
 public void displayDetails() {
		System.out.println("Student:" + getName()+ "|Type:PhD|GPA:"+ getGPA() + "|Status: " + (isPassed() ?"Passed":"Failed"));
	}
 
	
}


