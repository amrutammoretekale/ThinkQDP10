package com.Assi1;

import java.util.Scanner;
//. WAP to find 2nd max value in an array [20, 0, 31, 45, 100, 1, 105, 90]
public class Find2ndMaxno {
public static int findmaxno(int arr[]) {
	int i = 0;
	int temp;
	int j=i+1;
	for( i=0;i<arr.length;i++) {
		if(arr[i]>arr[j]) {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		j++;
	}System.out.println("Second lrgest no is:"+arr[arr.length-1]);
	 
	 return 0;
}
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		
		int arr[]=new int[]{20, 0, 31, 45, 100, 1, 105, 90};
    
         findmaxno( arr);
	}


	}


