package com.basic;

import java.util.Arrays;

public class PassinArray {
        static void squareElements(int ar[]) {
        	
        	for (int i=0;i<ar.length;i++) {
        		ar[i]=ar[i]*ar[i];
        	}
        	System.out.println("Inside method");
        	
        	System.out.println(Arrays.toString(ar));
        }
        int sumofElements(int ar[]) {
        	int sum=0;
        	for(int i=0;i<ar.length;i++) {
        		sum+=ar[i];
        	}
        	return sum;
        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {5,6,8,7,2};
        
        int a[]= {4,5,3,4};
        System.out.println(arr);//object inherit
        System.out.println(Arrays.toString(arr));
        
        //Display: using loop
        //Student s=new Student();
        //System.out.println(s.toString());
        squareElements(arr);
        System.out.println("----------------");
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(a));
        
        squareElements(a);
        System.out.println("----------");
        System.out.println(Arrays.toString(a));
        
        System.out.println("----------");
        PassinArray obj=new  PassinArray();
        
        //Anontmous array
        System.out.println("sum is:"+obj.sumofElements(new int[]{1,5,5,4} ));
	  int a1[]= {1,2,48,9};
	  System.out.println("sum is:"+obj.sumofElements(a1));
	}

}
