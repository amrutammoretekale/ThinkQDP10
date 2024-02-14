package com.Assi1;

import java.util.Arrays;

//Shift all the even number at the end of array using temporary array 
public class ShiftEvnNoEndUsingTempArray {
	public static void shiftevnno(int ar[]) {
		int temp[]=new int[ar.length];
		int index=0;
		for(int i=0;i<ar.length;i++) {
			for(int j=ar.length;j>=0;j--) 
			{
				if(ar[i]%2==0 && i<j) {
					 temp[index]=ar[j];
					ar[j]=ar[i];
					ar[i]=temp[index];
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[]= {2,5,4,8,6,7};
		shiftevnno(arr);
		System.out.println(Arrays.toString(arr));

	}

}
