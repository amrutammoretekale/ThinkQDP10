package com.basic;


import java.util.Arrays;
import java.util.Scanner;

public class PrintCubeOfEachNo {
    public static int[] cubeofarray(int arr[]) {
    	
    	for(int i=0;i<arr.length;i++) {
    	arr[i]=arr[i]*arr[i]*arr[i];
    	  
    	}
    	return arr;
    	 
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
    	System.out.println("Enter size of");
   	    int  size=sc.nextInt();
   	    int arr[]=new int[size];
   	
   	    System.out.println("Enter element");
   	    for(int i=0;i<arr.length;i++) {
   	    arr[i]=sc.nextInt();
   	     }
    	  System.out.println("----------------");
    	 System.out.println(Arrays.toString(cubeofarray(arr)));
    	 
    	}

	}


