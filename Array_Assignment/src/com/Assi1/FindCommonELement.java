package com.Assi1;

import java.util.Arrays;

//Write a Java program to find the common elements between two arrays 
//(int values) 
//Means e.g. arr1[] = [12, 23, 34, 67 ,78, 91, 56] and 
//arr2[] = [39, 25, 15, 23, 55, 91, 
//66, 22], so common between two arrays are 23 and 91 
public class FindCommonELement {
	 public static void findduplicate(int arr[],int arr1[]) {
		  int i=0;
		  int Common = 0;
		  for(i=0;i<arr.length-1;i++) {
			  for(i=0;i<arr1.length-1;i++) {
	          if(arr[i]==arr1[i]) {
	        	  Common=arr[i];
	        	  arr[i]=arr1[i];
	        	  arr1[i]=Common;
				  
	          }
		  }	  
	   }System.out.println("Common number is:"+Common);
	 }
	public static void main(String[] args) {
		int arr[]=new int[] {12, 23, 34, 67 ,78, 91, 56};
		int arr1[]=new int[] {39, 25, 15, 23, 55, 91,66, 22};
		findduplicate( arr, arr1) ;
	}

}
