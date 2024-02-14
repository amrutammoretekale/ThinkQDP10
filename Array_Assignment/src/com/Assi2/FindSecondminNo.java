package com.Assi2;

import java.util.Arrays;

public class FindSecondminNo {
   static int findsecondminno(int arr[]) {
	   int Minimum=Integer.MAX_VALUE;
	   int Sminimum=Integer.MAX_VALUE;
	   for(int x:arr) {
		   if(x<Minimum) {
			   Sminimum=Minimum;
			   Minimum=x;
			   }
		   else if(x<Sminimum) {
			   Sminimum=x;
		   }
	   }
//	   for(int i=0;i<arr.length;i++) {
//		   if(arr[i]<Minimum) {
//			   Sminimum=Minimum;
//			   Minimum=arr[i];
//			   }
//		   else if(arr[i]<Sminimum) {
//			   Sminimum=arr[i];
//		   }
//	   }
	return Sminimum;
	
   }
	public static void main(String[] args) {
		int arr[]= {2,5,3,1,4,6};
		System.out.println(Arrays.toString(arr));
		int Sm= findsecondminno(arr);
		System.out.println("Second minimum no is:"+Sm);
		

	}

}
