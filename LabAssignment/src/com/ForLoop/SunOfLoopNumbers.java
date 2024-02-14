package com.ForLoop;

import java.util.Scanner;

public class SunOfLoopNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num, i, sum = 0;
		for (; sum <= 100;) {
			System.out.println("Enter Number");
			num = sc.nextInt();
			if (num < 0) {
				continue;
			} else if (num > 0) {
				sum = sum + num;
				System.out.println("sum:" + sum);
			}

		}
	}

}
