package com.ForLoop1;

import java.util.Scanner;

public class FindPrimeNumber {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the number");
		  int i,num,count=0;
		  num=sc.nextInt();
		  for(i=0;i<=num/2;i++) {
			  if(num%i==0) {
				  count++;
			  }
		  }
		  if(count==0) {
			  System.out.println("num is prime");
		  }
		  else {
		  System.out.println("not prime number");

	}
	}
}
