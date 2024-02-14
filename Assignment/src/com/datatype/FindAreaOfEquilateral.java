package com.datatype;

import java.util.Scanner;

//4. Write a Java program to calculate area of an equilateral triangle.
public class FindAreaOfEquilateral {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double a,area;
		System.out.println("Enter value of a ");
		a=sc.nextInt();
		area=(1.73*a*a)/4;
		System.out.println("area of equilateral:"+area);

	}

}
