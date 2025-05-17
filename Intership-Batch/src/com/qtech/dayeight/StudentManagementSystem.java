package com.qtech.dayeight;

public class StudentManagementSystem {
		public static void main(String[]args) {
			Student[]student = new Student[5];
			int PassedCount = 0;
			int totalStudents= 0;
			
			try {
				student[0] = new UndergraduateStudent("UG001", "John Doe","cs", 3.5);
				totalStudents++;
			}catch(InvalidGPAException e) {
				System.out.println("Error occured while setting GPA for student ID:UG001");
				System.out.println(e.getMessage());
			}
			try {
				student[1] = new PostgraduateStudent("PG001","Alice Smith","Business", 2.3);
				totalStudents++;
				
		}catch(InvalidGPAException e) {
			System.out.println("Error occured while setting GPA for student ID:PG001");
			System.out.println(e.getMessage());
		}
			try {
				student[2] = new PhDStudent("PHD", "Dr.Carl Sagan","Physics",3.9);
				totalStudents++;
				
			}catch(InvalidGPAException e) {
				System.out.println("Error occured while setting GPA for student ID:PHD001");
				System.out.print(e.getMessage());
				
			}
			try {
				student[3] = new UndergraduateStudent("UG004","Jane Roe","Engineering",5.0);
				totalStudents++;
			}catch(InvalidGPAException e) {
				System.out.println("Student:Error occured while setting GPA for student ID:UG004");
				System.out.println("InvalidGPAException:"+ e.getMessage());
			}
			try {
				student[4] = new PhDStudent("PHD002", "Dr. Grace Hopper","Computer Science",3.2);
				totalStudents++;
			}catch(InvalidGPAException e) {
				System.out.println("Error occured while setting GPA for student ID:PHD002");
				System.out.println(e.getMessage());
			}
			for(Student Student:student) {
				if(Student!=null) {
					Student.calculateGrade();
					Student.displayDetails();
					if(Student.isPassed()) {
						PassedCount++;
					}
				}
			}
			System.out.println("Total Students:"+totalStudents);
			System.out.println("Students Passed:"+PassedCount);
		}
	}

		
					
				
			
				