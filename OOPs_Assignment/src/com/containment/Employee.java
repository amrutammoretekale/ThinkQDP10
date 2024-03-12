package com.containment;

public class Employee {
private int eid;
private String ename;
private double salary;
Department department;
public Employee() {
	
}
public Employee(int eid, String ename, double salary, Department department) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.salary = salary;
	this.department = department;
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
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
	return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", department=" + department + "]";
}

}
