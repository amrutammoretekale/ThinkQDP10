package com.Assi2;

import java.util.Arrays;
//6> Shift zeros at the beginning of array
public class ShiftZeroFromBeggining {
	public static void main(String[] args) {
		int arr[]= {1,2,3,0,5,0,10};
	    int temp[]=new int[arr.length];
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			 if(arr[i]==0)
			 {
				 temp[j]=arr[i];
				 j++;
				 
			 }
			 
		}
	for(int i=0;i<arr.length;i++)
		{
			
			 if(arr[i]!=0)
			 {
				 temp[j]=arr[i];
				 j++;
				 			 }
			 
		}
		System.out.println(Arrays.toString(temp));
		

	}

}


