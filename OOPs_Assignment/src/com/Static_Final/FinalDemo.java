package com.Static_Final;
//9.WAP to Show 3 use of final - final class, final variable and final method
class Employee123{
	int id;
	String name;
	final int WorkingHours=8;
	Employee123(){
		
	}
	Employee123(int id ,String name){
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
	public int getWorkingHours() {
		return WorkingHours;
	}

public class FinalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
}
