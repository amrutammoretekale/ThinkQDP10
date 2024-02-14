package com.switchcase1;

import java.util.Scanner;

public class CheakVowelOrConso {
	public static char vowelconso(char ch1) {
		char ch = 0;
		switch(ch1) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("number is vowel");
			break;
		case 2:
			System.out.println("number is consosnt");
			break;
		
		}return ch;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char ch;
		System.out.println("Enter character");
		ch=sc.next().charAt(0);
        char ch1=vowelconso(ch);
        System.out.println(ch1);
	}

}
