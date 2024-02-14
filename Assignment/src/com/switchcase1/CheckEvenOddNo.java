package com.switchcase1;

import java.util.Scanner;

public class CheckEvenOddNo {
	
	public static int evenodd(int num) {
				 switch(num%2) {
			case 0:
				System.out.println(num+" is even number ");
			    break;
			case 1:
				System.out.println(num+" is odd number ");
			    break;
		} return num;
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter number ");
		num=sc.nextInt();
		int n=evenodd(num);
		System.out.println(n);
		
	}

	}

