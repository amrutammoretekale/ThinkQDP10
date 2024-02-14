package com.IfElse;

import java.util.Scanner;

public class ElctricityBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      double amount,unit,units,bill,extra;
      System.out.println(" Enter unit");
      unit=sc.nextInt();
      if(unit<=50) {
    	  amount=unit*0.50;
    	  extra=unit*0.2;
    	  bill=amount+extra;
    	  System.out.println("bill:"+bill);
      }
    	  else if(unit>50) {
    		  amount=unit*0.75;
        	  extra=unit*0.2;
        	  bill=amount+extra;
        	  System.out.println("bill:"+bill);
    	  }
    	  else if(unit>100) {
    		  amount=unit*1.20;
        	  extra=unit*0.2;
        	  bill=amount+extra;
        	  System.out.println("bill:"+bill);
    	  }
    	  else if(unit>250) {
    		  amount=unit*1.50;
        	  extra=unit*0.2;
        	  bill=amount+extra;
        	  System.out.println("bill:"+bill);
    	  } 
        	
	}

}
