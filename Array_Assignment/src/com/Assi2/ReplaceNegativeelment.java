package com.Assi2;

import java.util.Arrays;

//5>> WAP to replace the negative elements in an array with immendiate left elements square
//ar={1,2,-3,2,-4,-6}
//o/p={1,2,4,2,4,16}
//here -> -3 is replaced by square of 2 which is 4
public class ReplaceNegativeelment {
	static void shiftNegative(int ar[])
	{
		int left=0;
		int right= ar.length-1;
		
		while(left<right)
		{
			while(ar[left]>0 && left<right)
				left++;
			while(ar[right]<0 && left<right)
				right++;
			if(left<right)
			{
				int tmp= ar[left];
				ar[left]= ar[right];
				ar[right]=tmp;
				left++;
				right--;
				
			}
			
		}
		
	}
	
	static void shiftNegative2(int ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			for(int j=ar.length-1;j>=0;j--)
			{
				if(ar[i]<0 &&i<j)
				{
					int temp=ar[j];
					ar[j]=ar[i];
					ar[i]=temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int arr[]= {1,2,-3,2,-4,-6};
		System.out.println(Arrays.toString(arr));
		
//		shiftNegative(arr);
//		
//		System.out.println(Arrays.toString(arr));
		
		shiftNegative2(arr);
		
		System.out.println(Arrays.toString(arr));
		
	}

	}


