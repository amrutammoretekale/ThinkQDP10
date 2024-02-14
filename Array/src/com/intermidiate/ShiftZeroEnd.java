package com.intermidiate;

import java.util.Arrays;

public class ShiftZeroEnd {
	static void shiftzeroEnd(int arr[]) {
	
    int temp[]=new int[arr.length];
	int j=arr.length-1;
	for(int i=0;i<arr.length;i++)
	{
		 if(arr[i]==0)
		 {
			 temp[j]=arr[i];
			 j--;
			 
		 }
		 
	}
for(int i=arr.length-1;i>=0;i--)
	{
		
		 if(arr[i]!=0)
		 {
			 temp[j]=arr[i];
			 j--;
			 			 }
		 
	}
	System.out.println(Arrays.toString(temp));
	

}
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,0,5,0,10};
		shiftzeroEnd(arr);

	}

}
