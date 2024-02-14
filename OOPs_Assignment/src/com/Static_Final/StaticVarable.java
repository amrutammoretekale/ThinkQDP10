package com.Static_Final;
//Create a class Car with String model and inttotalCarSold as 
//static variable in main() method.
//2.	Change the value of variable by class name then Print it.
//3.	Create two object of Car class and change value of static variable 
//by 1st object and print it by accessing 2nd object.
class Car{
	 static int totalcarsold;
	 String model;
	
	 
	 Car(){
		 
	 }
	 Car(int totalcarsold,String model){
		 this.totalcarsold=totalcarsold;
		 this.model=model;
	 }
	 void display(){
		 System.out.println("totalcarsold:"+totalcarsold+" "+"model:"+model);
	 }
	
}

public class StaticVarable {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1=new Car(12,"bmw");
		Car c2=new Car(52,"whagnor");
		c1.display();
		c2.display();
		

	}

}
