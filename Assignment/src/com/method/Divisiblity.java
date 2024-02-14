 package com.method;

import java.util.Scanner;

public class Divisiblity {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int  n=1;
		  div(n);
	}

	public static void div(int number) {
		Scanner sc = new Scanner(System.in);
		int num, rem, quetiont;
		System.out.println("Enter Number");
		num = sc.nextInt();
	
		if (num % 10 == 0) {
			System.out.println("Number is Divisible by 10");
		} else {
			rem = num % 10;
			quetiont = num / 10;
			System.out.println("rem:" + rem);
			System.out.println("quetiont:" + quetiont);
		}
	}
}