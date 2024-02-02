package com.intermidiate;

import java.util.Arrays;

//1>> WAP to half sort the array in ascending and half in descending
public class HalfRotateArray {
   static void rotatehalfarray(int arr[]) {
	   for(int i=0;i<arr.length/2;i++) {
		   for(int j=i+1;j<arr.length/2;j++) {
			   if(arr[j]<arr[i])
				{
					int temp= arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
		   }
	   }
	   for(int i=3;i<arr.length;i++) {
		  for(int j=i+1;j<arr.length;j++) {
			  if(arr[j]<arr[i])
				{
					int temp= arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
		  } 
	   }
   }
	public static void main(String[] args) {
	int arr[]= {2,5,3,1,4,6,0};
		
		System.out.println("Before Sorting:");
		System.out.println(Arrays.toString(arr));
		
		 rotatehalfarray(arr);
		
		System.out.println("After Sorting:");
		System.out.println(Arrays.toString(arr));

	}

}
