package com.method;

import java.util.Scanner;

public class Factirial {
	 static Scanner sc=new Scanner(System.in);
	public static long fact(int num) {
		int i;
		int fact = 1;
		for (i = 1; i <= num; i++) {
			fact = fact * i;
					
		}return fact;
	}

	public static void main(String[] args) {
	
		System.out.println("Enter the Number");
	int number=sc.nextInt();
	long result=fact(number);
		System.out.println("the factorial of " +number+ "is" +result);
	}
			
		
		
	}


