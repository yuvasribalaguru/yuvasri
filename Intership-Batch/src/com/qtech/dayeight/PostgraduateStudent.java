package com.qtech.dayeight;

 class PostgraduateStudent extends Student {
	
public PostgraduateStudent(String StudentId, String name, String department, double gpa )throws InvalidGPAException{
		super(StudentId, name, department, gpa);
}
public void calculateGrade() {
	//GPA already represent grade for simplicity
}

public boolean isPassed() {
		return getGPA()>=2.5;
}
	
public void displayDetails() {
		System.out.println("Student:" + getName()+ "|Type:Postgraduate|GPA:"+ getGPA() + "|Status: " + (isPassed() ?"Passed":"Failed"));

	}

}
