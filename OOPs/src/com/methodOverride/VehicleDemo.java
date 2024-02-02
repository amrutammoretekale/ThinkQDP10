package com.methodOverride;
//A vehicle has four wheels and a color assigned to it.
//A car is a vehicle with a seating capacity of four.
//An SUV is a car which has a 800 horsepower engine. Create a 
//model detailing the same.

class Vehicle{
	protected int wheelsno;
	protected String color;
	
	Vehicle(){
		
	}
	Vehicle(int wheelsno,String color){
		this.wheelsno=wheelsno;
		this.color=color;
	}
	
	
	
	public void setWheelsno(int wheelsno) {
		this.wheelsno=wheelsno;
	}
	public int getWheelsno() {
		return wheelsno;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	public String toString() {
		return "Wheelsno:"+wheelsno+" "+"color:"+color;
	}
}
class Car extends Vehicle{
	private int seatingcap;
	
	Car(){
		
	}
	Car(int wheelsno,String color,int seatingcap){
		super( wheelsno, color);
		this.seatingcap=seatingcap;
	}
	public void setSeatingcap(int seatingcap) {
		this.seatingcap=seatingcap;
	}
	
	public String toString() {
		return super.toString()+ " seatingcap:"+seatingcap;
	}
	
}
class SUV extends Car{
	int Hp;
	SUV(){
		
	}
	SUV(int wheelsno,String color,int seatingcap,int Hp){
		super( wheelsno, color,seatingcap);
		this.Hp=Hp;	
		}
	public void setHp(int Hp) {
		this.Hp=Hp;	
	}
	public int getHp() {
		return Hp;
	}
	public String toString() {
		return super.toString()+" "+ "Hp:"+Hp;
	}
}

public class VehicleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle v1=new Vehicle(4,"blue");
		System.out.println(v1);
		
		Car c1=new Car(4,"red", 5);
		System.out.println(c1);
		
		SUV s1=new SUV(4,"yellow" ,6,100);
		System.out.println(s1);
		

	}

}
