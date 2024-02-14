package com.Assi1;

import java.util.Arrays;

//WAP to put even and odd elements of array in two separate arrays.
public class putEvnOddNoSeprate {
     public static  void evnAndOdd(int arr[]) {
    
    			int arreven[]=new int[arr.length];
    			int arrodd[]=new int[arr.length] ;
    			int evenindex=0,oddindex=0;
    			for(int i=0;i<arr.length;i++) {
    				if(arr[i]%2==0) {
    					arreven[evenindex]=arr[i];
    					evenindex++;
    				}
    				else {
    					arrodd[oddindex]=arr[i];
    					oddindex++;
    				}
    			}
    			System.out.println("Even Array:"+Arrays.toString(arreven));
    			System.out.println("odd Array:"+Arrays.toString(arrodd));
    			
    			
    		}
     
	public static void main(String[] args) {
		int arr[]=new int[] {78,85,56,45,85,77,88,66};
		evnAndOdd(arr);

	}

}
