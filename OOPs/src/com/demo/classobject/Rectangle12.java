package com.demo.classobject;
//compitable
public class Rectangle12 {
	
	   double length;
	   double breadth;
	   
public void setData(double len,double br) {
		  length=len;
		  breadth=br;
	   }
public void displayData() {
	     System.out.println("length:"+length);
	     System.out.println("breadth:"+breadth);
}	
 public double CalArea() {
	 return length*breadth;
 }
 public double CalPerimeter() {
	 return 2*(length*breadth);
 }
}
