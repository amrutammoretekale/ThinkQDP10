package com.Assi3;
//1> Find the max and minimum number from an array and swap their positions
//eg:{1,2,3,4,5,6}
//o/p:{6,2,3,4,5,1}
//
//2>>Shift all the even number at the end of array using temporary array 
//3>>Shift all the even number at the end of array w/o using temporary array




//8>> Print alternate prime number in an array

import java.util.Arrays;

public class FindMinMaxSwapingPosition {
	 static void rotatehalfarray(int arr[]) {
		   for(int i=0;i<arr.length/2;i++) {
			   for(int j=i+1;j<arr.length/2;j++) {
				   if(arr[j]<arr[i])
					{
						int temp= arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
			   }
		   }
		   for(int i=3;i<arr.length;i++) {
			  for(int j=i+1;j<arr.length;j++) {
				  if(arr[j]<arr[i])
					{
						int temp= arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
			  } 
		   }
	   }
	public static void main(String[] args) {
int arr[]= {2,5,3,1,4,6,0};
		
		System.out.println("Before Sorting:");
		System.out.println(Arrays.toString(arr));
		
		 rotatehalfarray(arr);
		
		System.out.println("After Sorting:");
		System.out.println(Arrays.toString(arr));

	}



	}


