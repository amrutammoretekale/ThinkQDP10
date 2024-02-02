package com.intermidiate;
//4>> WAP to left rotate the array
//ar={1,2,3,4,5}
//o/p: {3,4,5,1,2}
import java.util.Arrays;

public class RotateLeftArray {
	static void leftrotate(int arr[]) {
		 int len=arr.length;
		   int FristE=arr[0];
		   //shifting
		   for(int i=0;i<len-1;i++) {
			   arr[i]=arr[i+1];
			   }
		   arr[len-1]=FristE;
	   }
	

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		 System.out.println(Arrays.toString(arr));
		
		 for(int i=0;i<3;i++) {
			 leftrotate(arr);
	     System.out.println(Arrays.toString(arr));
			}
		 System.out.println("---------------------------");
		 System.out.println(Arrays.toString(arr));

	}

	}


