package com.basic;

import java.util.Scanner;

public class FindMaximumNo {
 
public static int findmaxelement(int arr[]) {
	int i = 0;
	 int max=arr[i];
	for( i=0;i<arr.length;i++) {
		if(arr[i]>max) {
			max=arr[i];
		}
	}System.out.println(max);
	 
	 return 0;
	 
 }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Size of:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		System.out.println("Enter element");
		for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
		}
      System.out.println("--------------------");
      findmaxelement( arr);
      
	}

}
