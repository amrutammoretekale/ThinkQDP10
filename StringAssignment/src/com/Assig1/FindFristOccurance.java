package com.Assig1;

public class FindFristOccurance {
	 static void fristOccurance(String s,char ch) {
		 int count=0;
		  for(int i=0;i<s.length();i++) {
			  if(s.charAt(i)==ch) {
				  System.out.println(ch+" at index "+i);
				  count++;
				  break;
			  }
		  }System.out.println("count:"+count);
	  }
	public static void main(String[] args) {
		String str="Amruta";
		fristOccurance(str,'m');

	}

}
