package com.SwitchCase;

import java.util.Scanner;

public class AirLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int choice,coupen;
      double amount=20000;
      String bp = null,des = null,name=null;
      System.out.println("Enter Your name");
      name=sc.next();
      System.out.println("-------welcome to Airline------");
      System.out.println("1.Lufthansa\n2.AirArabia\n3.Indigo");
      System.out.println("Enter your choice");
      choice=sc.nextInt();
      switch(choice) {
      case 1:
    	  System.out.println("Enter your bording place");
    	  bp=sc.next();
    	  System.out.println("Enter your Destination");
    	  des=sc.next();
    	  System.out.println("your amount will be 20000");
    	  System.out.println("Do you have a coupen ");
    	  coupen=sc.nextInt();
    	  if(coupen==1) {
    		  System.out.println("disscount offer is 25% on your amount");
    		  amount=amount-amount*0.25;
    		  }
    	  break;
      case 2:{
    	  System.out.println("Enter your bording place");
    	  bp=sc.next();
    	  System.out.println("Enter your Destination");
    	  des=sc.next();
    	  System.out.println("your amount will be 10000");
    	  System.out.println("Do you have a coupen if yes Enter 1 if no entre any number ");
    	  coupen=sc.nextInt();
    	  if(coupen==1) {
    		  System.out.println("disscount offer is 35% on your amount");
    		  amount=amount-amount*0.35;
      }  
    	  break;
    	  
      }
      }System.out.println(name+" your tickects has been booked from "+bp+" to "+des);
	} 
}
