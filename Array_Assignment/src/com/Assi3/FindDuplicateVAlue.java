package com.Assi3;
//4>> Delete all the duplicate elements from an char array
public class FindDuplicateVAlue {
  public static void findduplicate(char arr[]) {
	  char i,j;
	  for(i=0;i<arr.length-1;i++) {
		  for(j=(char) (i+1);j<arr.length;j++) {
		  if(arr[i]==arr[j]) {
			  System.out.println("Duplicate number is:"+arr[i]);
		  }
	  }
  }
  }
	public static void main(String[] args) {
		char arr[]=new char[] {'A', 'B', 'C', 'A' ,'E', 'B', 'G'};
		findduplicate( arr);

	}

}
