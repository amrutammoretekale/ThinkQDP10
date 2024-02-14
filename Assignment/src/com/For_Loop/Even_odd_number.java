package com.For_Loop;

import java.util.Scanner;

public class Even_odd_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
  int num,i;
  System.out.println("Enter number");
  num=sc.nextInt();
  for(i=0;i<=50;i++);{
	  if(i%2==0)
		  System.out.println("number is even");
	  else
		  System.out.println("Odd number");
  }
  
	}

}
