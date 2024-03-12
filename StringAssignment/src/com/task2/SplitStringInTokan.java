package com.task2;

public class SplitStringInTokan {
   static void splitString(String s) {
	   String[] st=s.split("\\$");
	   String str="";
	   for(int i=0;i<st.length;i++) {
		   str=str+st[i]+" ";
	   }
	   
	  System.out.println(str);
   }
	public static void main(String[] args) {
		String s="HELLO$WORLD";
		splitString(s);

	}

}
