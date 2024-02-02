package com.basic;

public class SumOfArray {

	public static void main(String[] args) {
		int arr[]=new int[5];
		arr[0]=45;
		arr[1]=84;
		arr[2]=24;
		arr[3]=52;
		arr[4]=41;
		int i;
		int sum=0;
		for(i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			
		}
		System.out.println(sum);

	}

}
