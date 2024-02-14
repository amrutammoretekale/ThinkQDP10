package com.Marge;

import java.util.Arrays;

public class merge_Array {
	static int[] mergeAll(int a1[],int a2[])
	{
		int len1= a1.length;
		int len2= a2.length;
		int mar[]= new int[len1+len2];
		int index=0; // for the mar
		
		for(int i=0;i<a1.length;i++)
		{
			mar[index++]= a1[i];
		}
		
		for(int i=0;i<a2.length;i++)
		{
			mar[index++]= a2[i];
		}
		
		
		return mar;
	}

	public static void main(String[] args) {
		int arr1[] = { 6, 7, 12, 5 };
		int arr2[] = { 10, 20, 30, 40, 90, 100 };
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		int m[]= mergeAll(arr1, arr2);
		System.out.println("After complete merge:");
		System.out.println(Arrays.toString(m));

}
}
