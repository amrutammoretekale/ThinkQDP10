package com.Assi1;

import java.util.Arrays;

//Create a class Student having id,name, array of marks
//and percentage
//Create a method to calculate percentage
//from the marks
//Create 5 object of this class anonymously.
//Display the student details containing id,name and percentage
public class Student {
	private int id;
	private String name;
	private Double marks[];
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, Double[] marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double[] getMarks() {
		return marks;
	}
	public void setMarks(Double[] marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", Marks=" + Arrays.toString(marks) + "]";
	}
	

	

	
	

}
