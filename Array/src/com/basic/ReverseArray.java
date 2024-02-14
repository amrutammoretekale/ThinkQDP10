package com.basic;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
public static void reversearray(int arr[]) {
	int i,temp;
	int j=arr.length-1;
	for(i=0;i<arr.length/2;i++) {
		
		 temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		j--;
	}
	System.out.println(Arrays.toString(arr));

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
      
      reversearray(arr);
	}

}
