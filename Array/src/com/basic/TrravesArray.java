package com.basic;

import java.util.Arrays;

public class TrravesArray {

	public static void main(String[] args) {
		int []arr=new int[5];
		arr[0]=90;
		arr[1]=89;
		arr[2]=100;
		arr[3]=89;
		arr[4]=67;
		//arr[5]=45;
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("---------");
		//array as a literal
		int arr1[]=new int[] {5,6,8,7,9};
		 for(int i=0;i<arr1.length;i++) {
			 System.out.println(arr1[i]);
		 }
		
		 int i=0;
		for(i=0;i<arr.length;i++) {
			arr[0]=90;
		}
		System.out.println(arr[0]);

	}

}
