package com.demo.switchcase;

import java.util.Scanner;

public class NestedSwichCase {
     public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int choice;
     
      System.out.println("1.vegitable\n2.capsico\n3.Tmato");
      System.out.println("Enter your choice");
      choice= sc.nextInt();
      
      switch (choice) {
    	  case 1:{
    		  System.out.println("1.red\n2.yellow\n3.green");
    	  System.out.println("Enter your choice");
    	  choice=sc.nextInt();
    	 int color = 0;
		switch(color) {
    	 case 1:
    		 System.out.println("red");
    		 break;
    	 case 2:
    		 System.out.println("yellow");
    		 break;
    	 case 3:
    		 System.out.println("green");
    		 break;
    	  } break;
    	  }
    	  case 2:{
    		  System.out.println("1.red\n2.yellow\n3.green");
        	  System.out.println("Enter your choice");
        	  choice=sc.nextInt();
        	 int color2 = 0;
    		switch(color2) {
        	 case 1:
        		 System.out.println("red");
        		 break;
        	 case 2:
        		 System.out.println("yellow");
        		 break;
        	 case 3:
        		 System.out.println("green");
        		 break;
    		} break;
    	  }
    		case 3:{
    			 System.out.println("1.red\n2.yellow\n3.green");
           	  System.out.println("Enter your choice");
           	  choice=sc.nextInt();
           	 int color3 = 0;
       		switch(color3) {
           	 case 1:
           		 System.out.println("red");
           		 break;
           	 case 2:
           		 System.out.println("yellow");
           		 break;
           	 case 3:
           		 System.out.println("green");
           		 break;
       		} break;
    	  }
    	  
      
      }
      
     }
	}

     
