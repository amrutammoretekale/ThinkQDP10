package com.Assi1;
//Write a Java program to find the duplicate values of an array of integer values. 
//Means e.g. arr[] = [3, 10, 90, 78, 56, 10, 78, 34, 61], 
//so duplicates are 10 and 78.
public class FindDuplicateVAlue {
  public static void findduplicate(int arr[]) {
	  int i,j;
	  for(i=0;i<arr.length-1;i++) {
		  for(j=i+1;j<arr.length;j++) {
		  if(arr[i]==arr[j]) {
			  System.out.println("Duplicate number is:"+arr[i]);
		  }
	  }
  }
  }
	public static void main(String[] args) {
		int arr[]=new int[]{3, 10, 90, 78, 56, 10, 78, 34, 61};
		findduplicate( arr);

	}

}
