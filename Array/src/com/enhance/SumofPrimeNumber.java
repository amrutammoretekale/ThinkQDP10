package com.enhance;

import java.util.Arrays;
//2>> Find the sum of prime numbers in array using enhanced for loop
public class SumofPrimeNumber {

	public static void main(String[] args) {
		int ar[] = { 4, 3, 7, 5, 1, 0 };
		System.out.println(Arrays.toString(ar));
		int sumE = 0;
		for (int x : ar) {
			boolean flag = false;
			if (x > 2) {

				for (int i = 2; i < x; i++) {
					if (x % i == 0) {
						flag = true;
						break;

					}
				}
				if (flag == false) {

					sumE = sumE + x;
					System.out.println(x + "is prime no");

				}

			}
		}
		System.out.println("sum:"+sumE);
	}
}
