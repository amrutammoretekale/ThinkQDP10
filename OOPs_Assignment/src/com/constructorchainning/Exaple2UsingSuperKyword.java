package com.constructorchainning;
class Employee{
	int id;
	String name;
	float salary;

Employee(int id,String name,float salary){
	this.id=id;
	this.name=name;
	this.salary=salary;
}
  void display() {
	  System.out.println(id);
	  System.out.println(name);
	  System.out.println(salary);
  }
}
class Employee1 extends Employee{
	int eid;
	String ename;
	
	
	Employee1(int id, String name, float salary,int eid,String ename) {
		super(id, name, salary);
	  this.eid=id;
	  this.ename=ename;
	}
	void dispaly() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(eid);
		System.out.println(ename);
	}
	
}
public class Exaple2UsingSuperKyword {

	public static void main(String[] args) {
		Employee e1=new Employee(101,"AAranav",12000);
		e1.display();
		System.out.println("--------------------------------");
		Employee1 e2=new Employee1(111,"ads",1220,222,"hkj");
        e2.display();
	}

}
