package com.IfElse;

import java.util.Scanner;

public class NumDivisiblity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter Number");
		num = sc.nextInt();
		if (num % 5 == 0) {
			System.out.println("Number is divisible by 5");

		} else if (num % 11 == 0) {
			System.out.println("nmber is divisible by 11");

		}

		else {
			System.out.println("Number is not Divisible by 5 and 11");

		}
	}
}
