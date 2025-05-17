package com.qtech.dayeight;

   class UndergraduateStudent extends Student {
	
	public  UndergraduateStudent(String StudentId , String name , String department , double gpa)throws InvalidGPAException{
		super(StudentId, name, department, gpa);
	}
	public void calculateGrade() {
		//GPA already represent grade for simplicity
		
	}
	
	public boolean isPassed() {
		return getGPA()>=2.0;
	}
	
	 public void displayDetails() {
		System.out.println("Student:" + getName()+ "|Type:Undergraduate|GPA:"+ getGPA() + "|Status:" +(isPassed()?"Passed":"Failed"));
		}
	}
