package com.basic;



import java.util.Arrays;
import java.util.Scanner;

public class FindSqrAndCube {
   public static void findsqr(int arr[]) {
	   int i;
	   for(i=0;i<arr.length;i++) {
		  arr[i]=arr[i]*arr[i]; 
	   }
	   System.out.println(Arrays.toString(arr)); 
	
   }
   public static void findcube(int ar[]) {
	   int i;
	   for(i=0;i<ar.length;i++) {
		  ar[i]=ar[i]*ar[i]*ar[i]; 
	   }
	   System.out.println(Arrays.toString(ar));  
	
   }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[] {1,5,4,6,4};
		System.out.println("1.Sqr\n2.Cube");
		System.out.println("Enter your Choice");
		 switch(sc.nextInt()) {
		 case 1:
		   findsqr(arr);
		  break;
		 case 2:
		   findcube(arr);
		 }

	}

}
