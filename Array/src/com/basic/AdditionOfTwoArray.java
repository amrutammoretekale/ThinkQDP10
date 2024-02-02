package com.basic;

import java.util.Arrays;

public class AdditionOfTwoArray {
  public static void additionarrayy(int arr[],int arr1[]) {
	  int i;
	  
	  int sumArray[]=new int[arr.length];
	  int sum=0;
	  for(i=0;i<arr.length;i++) {
		 sum=arr[i]+arr1[i];
		 sumArray[i]=sum;
	  }
	  System.out.println("Addition of two arrays:"+Arrays.toString(sumArray));
  }
	public static void main(String[] args) {
		int arr[]=new int[] {1,2,3,4,5};
		int arr1[]=new int[] {1,3,5,4,5};
		additionarrayy(arr,arr1);
	}

}
