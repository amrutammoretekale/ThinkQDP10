package com.method;

import java.util.Scanner;

public class AddThreeNumber {
	
	public static int add(int n1,int n2,int n3) {
		int sum;
		 sum=n1+n2+n3;
		 return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2,n3;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number");
	n1=sc.nextInt();
	
	System.out.println("Enter number");
	n2=sc.nextInt();
	System.out.println("Enter number");
	n3=sc.nextInt();
     int sum=add(n1,n2,n3);
     if(sum>100) {
    	 System.out.println(sum+"Hello");
     }
     else
     {
    	 System.out.println(sum+"bye");
     
     }
     
	}

}
