package com.task1;
//5.Write a Java program to remove all extra blank spaces from a given string.
public class RemoveBlanksSpaces {
	public static void removespaces(String s) {
		char ch[]=s.toCharArray();
		int i;
		int j=0;
		for(char c:ch) {
			if(c==' ') {
				continue;
				
			}System.out.print(c);
			
			
			
		}
	}
 
	public static void main(String[] args) {
		String str="java is a fun.";
		System.out.println(str);
		 removespaces(str);
	
		

	}

}
