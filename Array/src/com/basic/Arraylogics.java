package com.basic;

public class Arraylogics {
       static boolean searchElement(int ar[],int ele) {
    	   for(int i=0;i<ar.length;i++) {
    		   if(ar[i]==ele)
    			   return true;
    	   }return false;
       }
       static void searchElementOccuernce(int ar[],int ele) {
    	   boolean flag=false;
    	   for(int i=0;i<ar.length;i++) {
    		   if(ar[i]==ele) {
    			   flag=true;
    			   System.out.println("position"+i);
    		   }
    	   }
    	   if(!flag) {
    		   System.out.println("Element not found");
    	   }
       }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {5,2,4,5,1,4,5,1};
        
        if(searchElement(arr,5)) {
        	System.out.println("Element found");
        }
        else {
        	System.out.println("Element not found");
        }
        System.out.println("----------");
        searchElementOccuernce(arr,5);
	}

}
