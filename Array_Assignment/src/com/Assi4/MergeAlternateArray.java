package com.Assi4;

import java.lang.reflect.Array;
import java.util.Arrays;

//>> Merge the two arrays as follows
//ar1={1,2,3}
// ar2={4,5,6,7,8}
//o/p: mar1={1,4,2,5,3,6,7,8}
// mar2={1,5,3,7,8}
public class MergeAlternateArray {
	static void mergealteernatearray(int arr[],int arr1[]) {
		int len=arr.length;
		int len1=arr.length;
		int mar[]=new int[len+len1];
		int i,j,index = 0;
		for(i=0,j=0;i<len&&j<len1;i++,j++) {
			mar[index]=arr[i];
			
		}
		System.out.println(Arrays.toString(mar));
	}

	public static void main(String[] args) {
		int []arr= {1,2,3};
		int arr1[]= {4,5,6,7,8};
		
		mergealteernatearray(arr,arr1);

	}

}
