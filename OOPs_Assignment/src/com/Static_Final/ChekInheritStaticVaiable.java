package com.Static_Final;
//7.WAP to check whether you can inherit static variable of Parent class in Child class
//8.WAP to check whether you can inherit static method of Parent class in Child class
class Vehicle{
	static int id=10;
	
	Vehicle(){
		
	}
	Vehicle(int id){
		this.id=id;
	}
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		Vehicle.id = id;
	}
	static void change() {
		int id=20;
	}
	
}
class Car2 extends Vehicle{
	static String name="ITS";
	static void change() {
		String name="DBMS";
	}
	Car2(){
		
	}
	Car2(int id,String name){
		super(id);
		this.name=name;
	}
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		Car2.name = name;
	}
	
	static void display() {
		System.out.println("id:"+id+" "+"name:"+name);
	}
}
public class ChekInheritStaticVaiable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car2.change();
		Car2.display();
		
	

	}

}
