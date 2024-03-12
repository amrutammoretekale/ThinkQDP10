package com.Static_Final;
//6.	See if you can override static method.
class Employee{
	protected int id;
	protected String name;
	
	Employee(){
		
	}
	Employee(int id,String name){
		this.id=id;
		this.name=name;
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
	static void display() {
		System.out.println("Employee Salary...");
	}
}
class Employee2 extends Employee{
	private int Eid;
	private String Ename;
	
	Employee2(){
		
	}
	Employee2(int id,String name,int Eid,String Ename){
		super(id,name);
		this.Eid=Eid;
		this.Ename=Ename;
		}
	public int getEid() {
		return Eid;
	}
	public void setEid(int eid) {
		Eid = eid;
	}
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
//No-we can not override static method becz static method bound with class
	//@Override
	static void display() {
		System.out.println("Employee Salary Emp2...");
	}
}
public class CanOverridStaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee();
		e1.display();
		Employee2 e2=new Employee2();
		e2.display();

	}

}
