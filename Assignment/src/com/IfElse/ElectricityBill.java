package com.IfElse;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	     int units,rent;
	     double bill=0;
	     System.out.println("Enter units");
	     units=sc.nextInt();
	     if(units<=50) {
	    	 bill=100+(units*2);
	     }else 
	    	 if(units<=80) {
	    		 bill=100+(50*2)+((units-50)*3);
	    	 }else if(units<=100) {
	    		 bill=(50*2)+(30*3)+((units-100)*4);
	    	 }else {
		   bill=(50*2)+(30*3)+(20*4)+((units-100)*7);
		   rent=100;
		   bill +=rent;
		}
	     System.out.println("bill:" +bill);

	}

}
