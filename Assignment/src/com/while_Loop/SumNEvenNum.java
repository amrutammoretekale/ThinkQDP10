package com.while_Loop;

import java.util.Scanner;

//WAP to find sum of  even number between 1 to n
public class SumNEvenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int i, sum = 0, n = 1;
		n = sc.nextInt();
		for (i = 2; i <= n; i += 2) {
			if (i % 2 == 0) {
				sum = sum + i;
			}

		}
		System.out.println("sum of all even numbers between 1 to " + n + " is:" + sum);
	}
}
