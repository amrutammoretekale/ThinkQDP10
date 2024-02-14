package com.ForLoop1;
//5.	Write a Java program to print all alphabets from a to z. - using  for loop
public class Print_Alphabet {
   public static char printalphabet(char alp) {
	   char ch;
		for(ch='a';ch<='z';ch++) {
			System.out.println(ch);
			
		}return ch;
   }
	public static void main(String[] args) {
		char ch = 'a';
		printalphabet(ch);
	
		}

	}


