package com.datatype;

import java.util.Scanner;

//Write a Java program to enter base and height of a triangle and find its area
public class FindAreaOfTriangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float area,b,h;
		System.out.println("Enter base");
        b=sc.nextInt();
        System.out.println("Enter height");
        h=sc.nextInt();
        area=(b*h)/2;
        System.out.println("area of triangle:"+area);
	}

}
