package com.Assi1;
//3.  WAP to search for a given number in an array and accordingly 
//print the index if exists.

import java.util.Arrays;
import java.util.Scanner;

public class SearchElement {
	static void searchelement(int arr[],int ele) {
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			 if(arr[i]==ele) {
  			   flag=true;
  			   System.out.println("position:"+i);
  			   System.out.println("found");
		  }
	  }if(flag==false) {
		System.out.println("not fount");
	}
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
           System.out.println(Arrays.toString(arr) );
           searchelement(arr,4);
	}


		

	}


