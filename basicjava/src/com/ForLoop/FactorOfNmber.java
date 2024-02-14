package com.ForLoop;

import java.util.Scanner;

public class FactorOfNmber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int i, num = 12 ,count=0;
		for (i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
				System.out.println(i);
				
			}
			
		}System.out.println("no of Factor"+count);
	}

}
