package com.task1;

import java.util.Arrays;

// Write a program to sort string arrays on the basis of length and if length 
//is same then lexicographically
public class SortString {
 static void sortString(String s1[],String s2[]) {
	
	 for(int i=0;i<s1.length;i++) {
		   for(int j=i+1;j<s2.length;j++) {
			   if(s1.length!=s2.length) {
				System.out.println("is not lexocographically");
			   }
			   else
				   System.out.println("is lexocographically");
			 
		   }
	 }
			   
 }
	public static void main(String[] args) {
		String str[]={"java","c","Angular"};
		String str1[]= {"java","c"};
	
		sortString(str,str1) ;
		

	}

}
