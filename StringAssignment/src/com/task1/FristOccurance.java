package com.task1;

import java.util.Arrays;

//1.Write a Java program to find first occurrence of a character in a given string.
//.Write a Java program to count occurrences of a character in given string.
public class FristOccurance {
  static void fristOccurance(String s,char ch) {
	  for(int i=0;i<s.length();i++) {
		  if(s.charAt(i)==ch) {
			  System.out.println(ch+" at index "+i);
			  break;
		  }
	  }
  }
  static void middleOccurance(String s,char ch) {
	  int i;
	  int count=0;
	  for( i=0;i<s.length();i++) {
		  if(s.charAt(i)==ch) {
			  count++;
			  if(count==2) {
				  break;
			  }
		  }
	  }  System.out.println(ch+" at index "+i);
  }
  static int findOccurnceOfAllCharacter(String s) {
	  int count=0;
		boolean flag;
		char[] ch=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			count=1;
			flag=false;
			
			for(int j=i-1;j>=0;j--) {
				if(s.charAt(i)==s.charAt(j)) {
					flag=true;
					break;
				}
			}
			if(flag==false) {
				for(int k=i+1;k<s.length();k++) {
					if(s.charAt(i)==s.charAt(k))
						count++;
				}
				
				System.out.println(ch[i]+"-->"+count);
		   
			}
		}
		return count;
  }
		static void findOccuranceOfCharacter(String s) {
			
		}  
  
	public static void main(String[] args) {
		String str="Amrutaa";
		//fristOccurance(str,'a');
		//middleOccurance(str,'m');
		findOccurnceOfAllCharacter(str);;
	}

}
