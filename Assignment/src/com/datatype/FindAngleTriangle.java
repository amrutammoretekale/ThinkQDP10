package com.datatype;

import java.util.Scanner;

//. Write a Java program to enter two angles of a triangle and find the third angle.
public class FindAngleTriangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int b,a,c;
		System.out.println("Enter angle1");
		a=sc.nextInt();
		System.out.println("Enter angle2");
		b=sc.nextInt();
		c=180-(a+b);
		System.out.println("third angle:"+c);
		
		
	}

}
