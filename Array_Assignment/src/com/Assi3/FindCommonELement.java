package com.Assi3;

import java.util.Arrays;

//Find the common elements between the two arrays
public class FindCommonELement {
	 public static void findduplicate(char arr[],char arr1[]) {
		  
		  
		  for(int i=0;i<arr.length-1;i++) {
			  for( int j=0;j<arr1.length-1;j++) {
	          if(arr[i]==arr1[j]) {
	        	 System.out.println(arr[i]+" "+arr[j]);
	        	 
				  
	          }
		  }	  
	   }
	 }
	public static void main(String[] args) {
		char arr[]=new char[] {'A', 'B', 'C', 'D' ,'E', 'F', 'G'};
		char arr1[]=new char[] {'A', 'B', 'P', 'Q', 'Q', 'R','S', 'T'};
		findduplicate( arr, arr1) ;
	}

}
