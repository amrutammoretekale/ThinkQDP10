package com.Assi4;

import java.util.Arrays;

//3>>Write a program to reverse an array in following manner.
//Suppose array size is even then later half should come first and first half 
//should go last. E.g. input array { 1,2,5,7,3,4} output will be { 7,3,4, 1,2,5}. 
//If array size is even then middle element should remain as it is and array willbe
// reversed as above. E.g. input array { 5,22,55,21,4,54,10} output will be 
//{4,54,10,21,5,22,55}
public class FirstMidLastasitis {
	static void reversehalfarray(int arr[]) {
		
		for(int i=1;i<arr.length/2;i++) {
			for(int j=i+1;j<arr.length/2;j++) {
				if(arr[i]<arr[j]) {
			   int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			}
			
		}
		for(int i=(arr.length/2)+1;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length-1;j++) {
				int temp=arr[j];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}

	public static void main(String[] args) {
		int arr[]= { 5,22,55,21,4,54,10};
		System.out.println("before swapping arr");
		 System.out.println(Arrays.toString(arr));
		 
		 reversehalfarray(arr);
		 System.out.println("After Swapping");
		 System.out.println(Arrays.toString(arr));

	}

}
