package com.Assi1;
//11.  WAP to find and count total number of duplicate elements in an array.
public class CountDuplicteNoArraay {
	public static void findduplicate(int arr[]) {
		  int i,j;
		  int count=0;
		  for(i=0;i<arr.length-1;i++) {
			  for(j=i+1;j<arr.length;j++) {
			  if(arr[i]==arr[j]) {
				  System.out.println("Duplicate number is:"+arr[i]);
				  count++;
			  }
		  }
	  }
		  System.out.println("Count of duplicate no is:"+count);
		  
	  }
	public static void main(String[] args) {
		int arr[]=new int[]{3, 10, 90, 78, 56, 10, 78, 34, 61};
		findduplicate(arr);

	}

}
