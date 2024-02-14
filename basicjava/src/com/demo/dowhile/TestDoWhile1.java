package com.demo.dowhile;

import java.util.Scanner;

public class TestDoWhile1 {
   public static int add(int a,int b) {
	   return a+b;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int n1,n2,sum;
       char ch;
       do {
       System.out.println("Enter n1");
       n1=sc.nextInt();
       System.out.println("Enter n2");
       n2=sc.nextInt();
       sum=add(n1,n2);
       System.out.println("sum:"+sum);
       System.out.println("do you want to continue??if yes enter Y if you want to stop enter any char");
       ch=sc.next().charAt(0);
	}while(ch=='Y'||ch=='y');
       System.out.println("Thankyou");
	   System.out.println("End");
	}
	}



