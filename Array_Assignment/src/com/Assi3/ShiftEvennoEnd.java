package com.Assi3;

import java.util.Arrays;

public class ShiftEvennoEnd {
	static void shiftvennond(int arr[]) {
	            int temp[]=new int[arr.length];
				int j=arr.length;
				for(int i=arr.length-1;i<=0;i--)
				{
					 if(arr[i]%2==0)
					 {
						 temp[j]=arr[i];
						 j--;
						 
					 }
					 
				}
			for(int i=arr.length-1;i<=0;i--)
				{
					
					 if(arr[i]%2!=0)
					 {
						 temp[j]=arr[i];
						 j--;
						 			 }
					 
				}
				System.out.println(Arrays.toString(temp));
				

			}
		
	

	public static void main(String[] args) {
   int arr[]=new int[] {1,2,3,6,5,5,4};
   shiftvennond(arr);

	}

}
