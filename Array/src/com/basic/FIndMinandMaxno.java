package com.basic;

import java.util.Scanner;

public class FIndMinandMaxno {
	public static int[] findmaxelement(int arr[]) {
		int i = 0;
		 int max=arr[i];
		for( i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}System.out.println("Maximum no in array is:"+max);
		 
	 return arr;
	 
	}
	public static int[] findminelement(int arr[]) {
		int i = 0;
		 int min=arr[i];
		for( i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}System.out.println("Minimum no in array is:"+min);
		 
	 return arr;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Size of Array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		System.out.println("Enter Element");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("----------------------");
		findmaxelement(arr);
		findminelement(arr);
	}
}

		

	


