package com.method;

import java.util.Scanner;

public class Calculaor {
   public static int cal(int num) {
	   Scanner sc = new Scanner(System.in);
		char op;
		double n1, n2, res = 0;
		System.out.println("choose an operaator");
		op = sc.next().charAt(0);
		System.out.println("Enter Frist Number");
		n1 = sc.nextDouble();
		System.out.println("Enter secnd number");
		n2 = sc.nextDouble();

		if (op == '+') {
			res = n1 + n2;
		} else if (op == '-') {
			res = n1 - n2;
		} else if (op == '%') {
			res = n1 % n2;
		} else if (op == '*') {
			res = n1 * n2;
		}
		return num;
   }
	public static void main(String[] args) {
		System.out.println("result:"+cal(10));		
		int num=cal(10);
	}

}
