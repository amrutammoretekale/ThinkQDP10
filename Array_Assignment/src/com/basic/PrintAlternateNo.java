package com.basic;

import java.util.Arrays;
import java.util.Scanner;

public class PrintAlternateNo {
    public static int[] alternateno(int[] arr) {
    	int i;
    	
    	for(i=0;i<arr.length;i=i+2) {
    		System.out.println(arr[i]);
    	}
		return arr;
    }
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Size of:");
		int size=sc.nextInt();
		int[] arr=new int[size];
		
		System.out.println("Enter element");
		for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
		}
      System.out.println("--------------------");
      alternateno(arr);

	}

}
