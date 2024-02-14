package com.demo.nested_if_else;

import java.util.Scanner;

public class ProductPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int quantity,price,totalbill=0;
       System.out.println("Enter quantity");
       quantity=sc.nextInt();
      
       if(quantity>0) {
    	   if(quantity>50) {
    		   totalbill=quantity*100;
    		  
    	   }
    	   else if((quantity<50 && quantity>30)){
    		   totalbill=quantity*125;
    		  
    	   }
    	   else if(quantity<30) {
    		   totalbill=quantity*140;
    		  
    	   }
    	   System.out.println("totalbill:"+totalbill);
    		   
       }else
    	   System.out.println("quantity is negative");
	}

}
