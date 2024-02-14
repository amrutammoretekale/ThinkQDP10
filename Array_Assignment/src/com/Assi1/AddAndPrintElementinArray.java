package com.Assi1;
//WAP to add elements to single dimensional int array and 
//print elements from 1D array
public class AddAndPrintElementinArray {

public static void addandPrint(int arr[]) {
	 int i;
	 int sum=0;
	 
	 int[] sumi = new int[arr.length];
	 for(i=0;i<arr.length;i++) {
		 sum=sum+arr[i];
		sumi[0]=sum;
		 
	 }
	 System.out.println("Sum of elemrent:"+sumi[0]);
	 System.out.println(arr[0]);
	 System.out.println(arr[1]);
	 System.out.println(arr[2]);
	 System.out.println(arr[3]);
	 System.out.println(arr[4]);
 }
	public static void main(String[] args) {
		int arr[]=new int[] {1,2,3,4,5};
		 int[] sumi = new int[arr.length];
		addandPrint(arr);

	}

}
