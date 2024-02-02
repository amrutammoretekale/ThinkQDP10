package com.inheritance;

class Vehicle{
	private int Vno;
	private String model;
	protected double price;

public Vehicle() {
	System.out.println("In Vehicle Constructor");
}

public Vehicle(int Vno,String model,double price) {
	this.Vno=Vno;
	this.model=model;
	this.price=price;
}
public void setVno(int Vno) {
	this.Vno=Vno;
}
public int getVno() {
	return Vno;
}
public void setModel(String model) {
	this.model=model;
}
public String getmodel() {
	return model;
}
public void setPrice(double price) {
	this.price=price;
}
public double getPrice() {
	return price;
}

}
class Car extends Vehicle{
	protected int noofgears1;
	private String fueltype;
	Car(){
		
	}
	public Car(int Vno,String model,double price,int noofgears,String fueltype) {
		super(Vno,model,price);
		this.noofgears1=noofgears;
		this. fueltype= fueltype;
	}
	public void setNoofgears(int noofgears) {
		this.noofgears1=noofgears;
	}
	public int getNoofgears() {
		return noofgears1;
	}
	public void setfueltype(String fueltypes) {
		this.fueltype=fueltype;
	}
	public String getFueltype() {
		return fueltype;
	}
	
//
//public SportCar extends Car{
//	//Sportcar(){
///		
//	}
//	
//(int Vno,String model,double price,int noofgears,String fueltype){
//	
//}
//}
//public class MultilevelDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
