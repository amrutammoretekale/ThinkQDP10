package com.constructorchainning;
//Create a class Student with int id and String name as member variables.
//. Generate getter and setter methods for id and name. Observe in the generated setter method
//how the parameter’s value is assigned to the member variable using this keyword.
//. What would happen in the setter method if you remove ‘this.’ when assigning the parameter
//value?
//. Set id of first student to 11 and 21 to the other student’s id
//6. Check and observe if you can use ‘this’ in main method.
//7. super can be used to refer immediate parent class instance variable.
//8. super can be used to invoke immediate parent class method.
//9. super() can be used to invoke immediate parent class constructor.

class Student{
	int id;
	String name;
	
	Student(){
		System.out.println("in Default constructor");
		System.out.println(id);
		System.out.println(name);
	}
	Student(int id,String name){
	this();
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
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	
}
public class Example1 {

	public static void main(String[] args) {
		Student s1=new Student(101,"arnav");
		System.out.println(s1);
		Student s2=new Student(102,"anita");
		System.out.println(s2);
		s1.setId(141);
		System.out.println(s1);
		s2.setId(111);
		System.out.println(s2);
		
	}

}
