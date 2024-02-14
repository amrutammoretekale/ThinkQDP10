package com.while_Loop;

import java.util.Scanner;

//WAP to print sum of all odd number from 1 to n 
public class SumNOddNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int i, sum = 0, n = 1;
		n = sc.nextInt();
		for (i = 1; i <= n; i++) {
			if (i % 2 == 1){
				sum = sum + i;
			}

		}
		System.out.println("sum of all odd numbers between 1 to " + n + " is:" + sum);
	}

}
