package com.Assi1;

import java.util.Arrays;

//4.  WAP to copy an array by iterating the array.
public class CopyArray {
 public static void copyarray(int arr[],int arr1[]) {
	 int i;
	 for(i=0;i<arr.length;i++) {
		 arr1[i]=arr[i];
		
	 }
	 System.out.println("arr:"+Arrays.toString(arr));
	 System.out.println("arr1:"+Arrays.toString(arr1));
 }
	public static void main(String[] args) {
		int arr[]=new int[] {1,5,6,8,7};
		int[] arr1 = new int[arr.length];
		copyarray(arr,arr1) ;

	}

}
