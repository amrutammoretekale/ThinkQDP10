package com.interfaceDemo;
interface Student
{
	void show();
	default void display() {
		System.out.println("I am a student");
	}
}
interface Teacher
{
	void show();
	default void display() {
		System.out.println("I am a teacher");
	}
}

public class DimondProblemDemo implements Student ,Teacher{
 
	public void show() {
		System.out.println("School name:Hiritage School");
		
	}
	@Override
	public void display() {
		System.out.println("I am in School");
		Student.super.display();
		Teacher.super.display();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s;
		s=new DimondProblemDemo();
		s.show();
		s.display();
		
		Teacher t;
		t=new DimondProblemDemo();
		t.show();
		t.display();

	}

	
}
