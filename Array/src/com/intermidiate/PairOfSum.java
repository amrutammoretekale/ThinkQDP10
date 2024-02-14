package com.intermidiate;

public class PairOfSum {
	public static void pairofsum(int arr[],int sum) {
		 int i;
		 int len=arr.length;
		
		 for(i=0;i<len;i++) {
			 for(int j=i+1;i<len;j++) {
				 if(arr[i]+arr[j]==sum) {
					 System.out.println(arr[i]+" ,"+arr[j]);
				 }
			 }
		 }
		
	}

	public static void main(String[] args) {
		int arr[]=new int[] {2,3,5,4,6,0,8};
		int sum = 8;
		 pairofsum(arr,sum);

	}

}
