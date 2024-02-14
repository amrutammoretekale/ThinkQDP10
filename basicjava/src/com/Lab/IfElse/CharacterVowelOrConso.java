package com.Lab.IfElse;

import java.util.Scanner;

public class CharacterVowelOrConso {

	public static void main(String[] args) {
		
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter character");
		ch=sc.next().charAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		 System.out.println(ch+" is vowel");
		 else if(ch=='@'||ch=='$')
			 System.out.println(ch+" is special character");
		 else
			 System.out.println(ch+" is Consonant");
 
	}

}
