package com.methodOverride;

class Person{
	protected void display(String name) {
		 System.out.println("i am an person:"+name);
		 
	}
  static void show() {
	   System.out.println("i am an person");
  }
}
class Employee extends Person{
	protected void display(String name) {
		 System.out.println("i am an employee:"+name);
		 System.out.println("Orgniation : HCL");
	}
   static void show() {
	   System.out.println("i am an employee");
   }
}
class Trainee extends Person{

	@Override
	protected void display(String name)
    {
		super.display(name);
    	System.out.println("I am an trainee:"+name);
    	System.out.println("Probation period:3 months");
    }

}
public class MethodOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p= new Person();
		p.display("Amit");
		
		System.out.println("----------------------");
		Employee e= new Employee();
		e.display("Pradnya");
		
		//e.show();
		
		
		Trainee t= new Trainee();
		t.display("Ashish");

	}
}



