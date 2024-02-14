package com.For_Loop;

import java.util.Scanner;

public class Find_Max_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
  int n1,n2,n3,n=0,i;
  System.out.println("Enter Frist number");
  n1=sc.nextInt();
  System.out.println("Enter second  number");
  n2=sc.nextInt();
  System.out.println("Enter third number");
  n3=sc.nextInt();
  for(i=0;i<=n;i++) {
	  if(n1>n2 && n1>n3) {
	    	 System.out.println(n1+" is greater");
	     }else if(n2>n1 && n2>n3);{
	    	 System.out.println(n2+" is greater");
  }
	}

	}
}
