package com.while_Loop;

import java.util.Scanner;

//11.	Find all prime number between 400 to 300;
public class Prime_No {
	public static int countFactors(int n) {
		int i=1;
		int count=0;
		do {
			if(n%i==0)
			count++;
			
		}while(i<=n);
		return count;
		
		
	}
	
	public static boolean checkPrime(int start ,int end) {
		int n = 1;
		int count=countFactors(n);
		if(count==2)
			return true;
		else
			return false;
	}
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int start,end;
		System.out.println("Enter start");
		start=sc.nextInt();
		System.out.println("Enter end");
		end=sc.nextInt();
		boolean status=checkPrime(start,end);
		if(status)
			System.out.println("prime");
		else
			System.out.println("not prime");
	}

	}


