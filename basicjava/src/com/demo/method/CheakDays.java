package com.demo.method;

import java.util.Scanner;

public class CheakDays {
  public static void days(int day) {
	  String dayString="";     
	 
	switch(day) {
	  case 1:dayString= "1 - monday";  
		  
	  case 2:dayString ="2-Tuesday";
		  
	  case 3:dayString ="3-wensday";
		
	  case 4:dayString ="4-Thursday";
		
	  case 5:dayString ="5-Friday";
		  
	  case 6:dayString ="6-Saturday";
		
	  case 7:dayString ="7-Sunday";
		 
		  
	  }
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number of days");
		int day = sc.nextInt();
		int num = 0;
		days(day);
		  
	}
	
	}
	
		
	
	


