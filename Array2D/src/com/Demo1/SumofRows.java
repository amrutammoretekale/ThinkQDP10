package com.Demo1;

import java.util.Scanner;

public class SumofRows {
	 static void dispalymultiarry(int ar[][]) {
	    	for(int i=0;i<ar.length;i++) {
	    		for(int j=0;j<ar[i].length;j++) {
	    			System.out.println(ar[i][j]+" ");
	    		}
	    		System.out.println();
	    	}
	    }
	 public static void sumofarray(int[][]arr) {
		 int sum;
		 for(int i=0;i<arr.length;i++) {
			 sum=0;
			 for(int j=0;j<arr[i].length;j++) {
				 sum=sum+arr[i][j];
			 }
			 System.out.println("sum:"+sum);
		 }
	 }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows:");
		int rows=sc.nextInt();
		System.out.println("Enter cols");
		int cols=sc.nextInt();
		int arr[][]=new int[rows][cols];
		for(int i=0;i<arr.length;i++) {
		System.out.println("Enter value of rows:"+(i+1));
		for(int j=0;j<arr[i].length;j++) {
		arr[i][j]=sc.nextInt();	
		}

	}
		 System.out.println("---------");
	        dispalymultiarry(arr);
	        sumofarray(arr);

	}
}
