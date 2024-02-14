package com.Assi1;

import java.util.Arrays;

//WAP to print reverse of an array. Also print every alternate element backwards.
public class PrintRverseNo {
	public static void printreversearry(int arr[]) {
		int i;
		int j=arr.length-1;
		for(i=0;i<arr.length/2;i++) {
		
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			    j--;
		}System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int arr[]=new int[] {1,2,3,4,5,6};
		System.out.println(Arrays.toString(arr));
		 printreversearry(arr);

	}

}
