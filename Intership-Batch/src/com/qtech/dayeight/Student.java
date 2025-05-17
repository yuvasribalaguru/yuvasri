package com.qtech.dayeight;

  abstract class Student implements Evaluatable{
	// Abstract superClass
	
		private String StudentId;
		private String name;
		private String department;
		private double gpa;
		
		public Student(String StudentId, String name, String department, double gpa)throws InvalidGPAException {
			this.StudentId = StudentId;
			this.name = name;
			this.department = department;
			setGPA(gpa);
		}
		public String getStudent() {
			 return StudentId;
		}
		
		public String getName() {
			return name;
		}
		
		public String getDepartment() {
			return department;
		}
		
		public double getGPA() {
			return gpa;
		}
		
		public void setGPA(double gpa)throws InvalidGPAException{
			if (gpa<0.0||gpa>4.0) {
				throw new InvalidGPAException("GPA must be between 0.0 and 4.0");
			}
			
			this.gpa=gpa;
		}
		
		public abstract void calculateGrade();
		public abstract void displayDetails();
		
		}
			
		
			
			
		
		
			
		
