package com.example.conditionalstatement;

import java.util.Scanner;

public class DivisiblityTest1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter Number");
		num=sc.nextInt();
		if(num%5==0) {
			System.out.println("Number is divisible by 5");
			
		}
		else {
			System.out.println("Number is not Divisible by 5");
		}
	}

}
