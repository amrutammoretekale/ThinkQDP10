package com.demo.method;

import java.util.Scanner;

public class TestEvenOddByMethod {
	public static void evenodd(int num) {
		if(num%2==0)
			System.out.println("number is even");
		else
			System.out.println("number is odd");
	}
	
	public static int  evenodd1(int num) {
		return num%2;
	}
	public static boolean evenodd2( int num) {
		return num%2==0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter number");
		num=sc.nextInt();
		evenodd(num);
		
		int n=evenodd1(num);
		
		if(num==0)
			System.out.println("number is even");
		else
			System.out.println("number is odd");
		
         boolean status=evenodd2(num);
         System.out.println(status);
	}

}
