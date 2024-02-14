package com.forloop1;

import java.util.Scanner;



public class PrimeNumber {
	public static void prime(int n) {
		int i;
		int count=0;
		for(i=1;i<=n;i++){
			if(n%i==0) 
				count++;
			}
	
	
	  if(count==2)
		  System.out.println(n+" is prime number");
		  else
			  System.out.println(n+" is not prime number");

	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter num");
		num=sc.nextInt();
		 prime(num); 

	}

}
