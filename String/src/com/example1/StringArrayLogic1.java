package com.example1;

import java.util.Arrays;

public class StringArrayLogic1 {
	static void sortArray(String st[]) {
		  for(int i=0;i<st.length;i++) {
			   for(int j=i+1;j<st.length;j++) {
				   if(st[i].length()>st[j].length()) {
					   String temp=st[i];
					   st[i]=st[j];
					   st[j]=temp;
					   
				   }
			   }
		   }
	}
   static void sortlexo(String st[]) {
	   for(int i=0;i<st.length;i++) {
		   for(int j=i+1;j<st.length;j++) {
			   if(st[i].compareTo(st[j])>0) {
				   String temp=st[i];
				   st[i]=st[j];
				   st[j]=temp;
				   
			   }
		   }
	   }
   }
	public static void main(String[] args) {
String str[]= {"Java","C","Angular","HTML","Python"};
		
		System.out.println(Arrays.toString(str));
		
		sortlexo(str);
		
		System.out.println(Arrays.toString(str));
		
		sortArray(str);
		
		System.out.println(Arrays.toString(str));
		
		
		
	}

}
