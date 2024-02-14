package com.Lab.IfElse;

import java.util.Scanner;

public class LeapYearUsingTernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int year;
     String result;
     System.out.println("Enter year");
     year=sc.nextInt();
     result=((year%100==0 && year%400==0)||(year%4==0))?"is leap year":"not leap year";
     System.out.println(result);
	}

}
