package com.basic;

import java.util.Arrays;

public class ShiftNegativeNo {
   //at the end:negative
	static void shiftNegative(int ar[]) {
		int left=0;
		int right=ar.length-1;
		while(left<right) {
			while(left<right) {
				while(ar[left]>0 && left<right)
					left++;
				while(ar[right]<0 && left<right)
					right++;
				if(left<right) {
					int temp=ar[left];
					ar[left]=ar[right];
					ar[right]=temp;
					left++;
					right--;
				}
			}
		}
	}
	public static void main(String[] args) {
		int ar[]=new int[] {2,-1,6,5,-5,4,6};
		shiftNegative(ar);
		

	}

}
