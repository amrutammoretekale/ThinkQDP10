package com.Lab.IfElse;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Scanner sc=new Scanner(System.in);
	 int year;
     System.out.println("Enter Year");
     year=sc.nextInt();
     if((year%100==0 && year%400==0)||(year%4==0))
    	 System.out.println(year+" is leap year");
     else
    	 System.out.println(year+" is not leap year");
	}

}
