package com.Assi3;

import java.util.Scanner;

public class PrintAlternatePrimeNo {

	public static int countFactors(int arr[]) {
		int i = 0;
		int count=0;
		do {
			if(arr[i]%i==0)
			count++;
			
		}while(i<=arr[i]);
		return count;
		
		
	}
	
	public static boolean checkPrime(int arr[]) {
	   for(int i=0;i<arr.length;i+=2) {
		   int count=countFactors(arr);
			if(count==2)
				return true;
			else
				return false;
		}
	return false;
	   }
		
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[] {1,2,3,4,5,6};
		boolean status=checkPrime(arr);
		if(status)
			System.out.println("prime");
		else
			System.out.println("not prime");
	}

	}


