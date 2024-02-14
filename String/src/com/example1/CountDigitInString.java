package com.example1;

public class CountDigitInString {
	static int findCount(String s) {
		int count=0;
		char ch[]=s.toCharArray();
		for(char c:ch) {
			if(c>48 && c<57) {
				count++;
			}
		}
		return count;
	}
	static int findCount2(String s) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(Character.isDigit(s.charAt(i))){
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
	String str="java123Progr89mming05";
 
	System.out.println("Count:"+findCount(str));
	System.out.println(str);
	 System.out.println("Count:"+findCount2(str));
	
	}

}
