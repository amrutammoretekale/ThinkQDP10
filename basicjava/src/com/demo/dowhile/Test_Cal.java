package com.demo.dowhile;

import java.util.Scanner;

public class Test_Cal {
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
		int n1,n2,ans=0;
		char ch = 0;
		do {
		System.out.println("Enter num1");
		n1=sc.nextInt();
		System.out.println("Enter num2");
		n2=sc.nextInt();
		System.out.println("------simple calculator-----");
		System.out.println("1.add\n2.sub\n3.mul\n4.div");
		System.out.println("Enter choice");
		 int choice=sc.nextInt();
		 switch(choice) {
		 case 1:
			 ans=n1+n2;
			 break;
		 case 2:
			 ans=n1-n2;
			 break; 
		 case 3:
			 ans=n1*n2;
			 break; 
		 case 4:
			 ans=n1/n2;
			 break; 
			 default:
				 System.out.println("invalid");
		 }
		 System.out.println(ans+"ans");
			 System.out.println("Do you want to continue if yes Enter Y:");
		  ch=sc.next().charAt(0);
			 
		 
		}while(ch=='Y'||ch=='y');
			 System.out.println("Thankyou");
	}
	}


