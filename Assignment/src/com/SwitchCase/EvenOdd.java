package com.SwitchCase;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;

		System.out.println("Enter the number");
		num = sc.nextInt();
		switch (num % 2 ) {
		case 1:
			System.out.println("number is Even");
			break;

		default:
			System.out.println("Number is odd");
			break;
		}
	}

}
