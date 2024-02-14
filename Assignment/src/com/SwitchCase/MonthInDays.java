package com.SwitchCase;

import java.util.Scanner;

public class MonthInDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int month;
    System.out.println("Enter the month");
    month=sc.nextInt();
    switch (month) {
    	case 1 :
    	case 3 :
    	case 5 :
    	case 7:
    	case 8:
    	case 10:
    	case 12:
         System.out.println("30 Days in a month");
         break;
    	  
    	case 4:
    	case 6:
    	case 9:
    	case 11:
    	System.out.println("31 Days in a month");
    	break;
    	
    	case 2:
    	System.out.println("28 Dys n a month");
    	break;
    	
    	default :
    		break ;
    }
    
	}

}
