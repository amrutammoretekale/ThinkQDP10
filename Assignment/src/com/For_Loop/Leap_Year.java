package com.For_Loop;

import java.util.Scanner;

public class Leap_Year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int year,i;
String result;
System.out.println("Enter year");
year=sc.nextInt();



for(i=0;(year%100==0 && year%400==0)||year%4==0;i++) {

System.out.println("Leap Year");
break;
	}
	
	System.out.println(" not Leap Year");
}
}