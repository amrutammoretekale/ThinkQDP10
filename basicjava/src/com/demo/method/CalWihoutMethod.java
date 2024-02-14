package com.demo.method;

import java.util.Scanner;

public class CalWihoutMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num1,num2;
		int ans=0;
		int choice;
		System.out.println("Enter num1:");
		num1=sc.nextInt();
		System.out.println("Enter num2:");
		num2=sc.nextInt();
		
		System.out.println("1.add\n2.sub\n3.multiply\n4.div\n");
		System.out.println("Enter your choice:");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			ans=num1+num2;
			break;
		case 2:
			ans=num1-num2;
			break;
		default:
			System.out.println("invalid choice");
		}
		
		System.out.println("sum:"+ans);
	}

	}


