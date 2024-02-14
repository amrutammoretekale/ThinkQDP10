package com.Assi1;
//1.  WAP to add elements to single dimensional int array and print 
//elements from 1D array
public class AddArray {
  public static void addarray(int arr[]) {
		int i;
		int sum=0;
		for(i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			
		}
		System.out.println(sum);

	}

  
	public static void main(String[] args) {
		int arr[]=new int[5];
		arr[0]=45;
		arr[1]=84;
		arr[2]=24;
		arr[3]=52;
		arr[4]=41;
		addarray(arr);

	}

}
