package com.basic;

import java.util.Arrays;

public class FindMaxChar {
  public static void findmaxhar(char ch[]) {
	 char max=ch[0],min=ch[0];
	 for(int i=0;i<ch.length;i++) {
		if( max>ch[i]) {
			max=ch[i];
		}
		if( min<ch[i]) {
			min=ch[i];
		}
	 }
	 System.out.println("maximum character is:"+max);
	 System.out.println("minimum character is:"+min);

	  
  }
	public static void main(String[] args) {
		char ch[]=new char[] {'a','m','r','u','t','a'};
		
	      findmaxhar(ch);

	}

}
