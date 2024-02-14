package com.datatype;

import java.util.Scanner;

//1. Write a Java program to enter any number and calculate its square root
public class FindSqrRoot {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n1;
		System.out.println("Enter number");
		n1=sc.nextInt();
		double res=Math.sqrt(n1);
		System.out.println("res:"+res);

	}

}
