package com.ForLoop;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i, num;
		long fact = 1;
		System.out.println("Enter the Number");
		num = sc.nextInt();
		for (i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of" + num + "is" + fact);
	}

}
