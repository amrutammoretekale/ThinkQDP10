package com.datatype;

import java.util.Scanner;

//. Write a Java program to convert days into years, weeks and days
public class FindDaysWeeksMonth {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int days,year,weeks;
		System.out.println("enter days");
		days=sc.nextInt();
		year=days/365;
		weeks=(days%365)/7;
		days=(days%365)/7;
		System.out.println(" year:"+year);
		System.out.println("weeks:"+weeks);
		System.out.println("days:"+days);

	}

}
