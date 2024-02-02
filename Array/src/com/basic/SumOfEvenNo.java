package com.basic;

import java.util.Scanner;

public class SumOfEvenNo {
   public static void SumofEvn() {
	   
       Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		System.out.println("Enter elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("--------------------");
         int sum=0;
	   for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0){
				sum+=arr[i];
			System.out.println("Sum:"+sum);
			
   }
	   }
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumofEvn();
	}

}
