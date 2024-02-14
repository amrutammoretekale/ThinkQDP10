package com.Lab.IfElse;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char ch;
		int n1,n2,sum,sub,mul,div;
		System.out.println("enter operator");
		ch=sc.next().charAt(0);
		System.out.println("enter num1");
		n1=sc.nextInt();
		System.out.println("enter num2");
		n2=sc.nextInt();
		if(ch=='+') {
			sum=n1+n2;
			System.out.println("sum:"+sum);
		}
			else if(ch=='-') {
			sub=n1-n2;
			System.out.println("sub:"+sub);
			}
			else if(ch=='*') {
			mul=n1*n2;	
		    System.out.println("mul:"+mul);
			}
			else {
				div=n1/n2;
			System.out.println("div:"+div);
			}

	}

}
