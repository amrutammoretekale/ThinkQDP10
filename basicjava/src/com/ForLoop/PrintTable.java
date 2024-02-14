package com.ForLoop;

import java.util.Scanner;

public class PrintTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num, i=0;
		num = sc.nextInt();
		if(i>0) {
			System.out.println("number is positive");
		}
		for (i = 1; i <= 10; i++) {
			System.out.println(num + " * " + i + "=" + (num * i));
		}
	} 

}
