package com.task2;

import java.util.Arrays;
//WAP to make the first character of every word in a string as capita
public class FristCharacterCapital {
	public static void fristcharCapital(String st) {
		String s[]=st.split("\\s");
		for(int i=0;i<s.length;i++){
		String str="";
		if(s[i].charAt(0)>='a'&& s[i].charAt(0)<'z') {
			str=str+(char)(s[i].charAt(0)-32);
		}
		for(int j=1;j<s[i].length();j++) {
			str=str+s[i].charAt(j);
		}
		s[i]=str;
			
			
		}System.out.println(Arrays.toString(s));
		
	}

	public static void main(String[] args) {
		String str="i love india";
		 fristcharCapital(str) ;

	}

}
