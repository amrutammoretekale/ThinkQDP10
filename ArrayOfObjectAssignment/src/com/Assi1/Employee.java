package com.Assi1;

import java.util.Arrays;

//>>
//Create a class Department id, name, location
//Create a class Employee having id,name and salary
//and containment dept
//--> Create 2 anonymous object and one object from
//getter,setter
//----> Create object using user input
//---> Sort the employee on the basis of salary
//--->Find the employee having max salary
public class Employee {
  private int id;
  private String Ename;
  private double salary;
  private Department department;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int id, String ename, double salary, Department department) {
	super();
	this.id = id;
	Ename = ename;
	this.salary = salary;
	this.department = department;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getEname() {
	return Ename;
}
public void setEname(String ename) {
	Ename = ename;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public Department getDepartment() {
	return department;
}
public void setDepartment(Department department) {
	this.department = department;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", Ename=" + Ename + ", salary=" + salary + ", department="
			+ department + "]";
}
  
}
