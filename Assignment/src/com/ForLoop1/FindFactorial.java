package com.ForLoop1;

import java.util.Scanner;

public class FindFactorial {
	 public static int fact(int num) {
		   
			int i,n;
			int fact = 1;
			for(i=1;i<=num;i++) {
			fact=fact*i;
				}
			return fact;
	 }
	public static void main(String[] args) {
		int i,fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int number=sc.nextInt();
		int res= fact(number);
	
		System.out.println("Factorial of "+number+" is: "+res);
	

	}

}
