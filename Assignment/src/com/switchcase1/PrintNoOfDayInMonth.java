package com.switchcase1;

import java.util.Scanner;
//1. Write a Java program print total number of days in a month using switch case 
public class PrintNoOfDayInMonth {
	public static void days( int month) {
		
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
		
		System.out.println("31 days in month");
		break;
		
		case 4:
		case 6:
		case 9:
		case 11:
			
			System.out.println("31 days in month");
			break;
		case 2:
			
			System.out.println("28 or 29 days in month");
		}
	}
  
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int month;
		System.out.println("Enter number of month");
		month=sc.nextInt();
		days(month);

	}

}
