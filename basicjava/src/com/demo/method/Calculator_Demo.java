package com.demo.method;

import java.util.Scanner;
//when we are using method without void
//we can use return only one value at a time
//note: we must use return keyword
//return is last statement
//whenever we want to test any condition use return 
public class Calculator_Demo {
	public static int add(int a,int b) {
		return a+b;
	}
	public static int sub(int a,int b) {
		return a-b;
	}
	public static int mul(int a,int b) {
		return a*b;
	}
	public static int div(int a,int b) {
		return a/b;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n1,n2;
		int ans = 0;
		int choice;
		System.out.println("Enter num1");
		n1=sc.nextInt();
		System.out.println("Enter num2");
		n2=sc.nextInt();
		System.out.println("1.add\n2.sub\n3.mul\n4.div");
		System.out.println("Enter your choice");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			 ans = add(n1,n2);
			break;
		case 2:
			 ans=sub(n1,n2);
			break;
		case 3:
			ans=mul(n1,n2);
			break;
		case 4:
			ans=div(n1,n2);
			break;
			
		
		}System.out.println("ans:"+ans);
		
		//call
		//int ans=add(n1,n2);
		//System.out.println("sum:"+ans);

	}

}
