package com.qtech.intership.dayfour;

public class ChildClass extends ParentClass {
	@Override
	int add (int a, int b) {
		System.out.println("child class");
		return a+b;
	}
	//@Oerride
	int add(int a) {
		System.out.println("child class");
		return a;
		}
    @Override
	float add(float a, float b) {
		System.out.println("child class");
		return a+b;
		}
	 @Override
	 float add(int a, float b) {
		 System.out.println("child class");
		 return a+b;
	 }
	 public static void main(String[]args) {
		 ChildClass c=new ChildClass();
		 ParentClass p=new ParentClass();
		 System.out.println(c.add(23,67));
		 System.out.println(p.add(23,45 ));
	 }
	

}
