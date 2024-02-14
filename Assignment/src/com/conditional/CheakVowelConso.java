package com.conditional;

import java.util.Scanner;

public class CheakVowelConso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 int ch;
		 System.out.println("Enter alphabet");
		 ch=sc.nextInt();
		 
		 if (ch == 'a' || ch == 'u' || ch == 'i' || ch == 'o' || ch == 'u') {
				System.out.println( ch+"  is Vowel");
			} else {
				System.out.println( ch+ "is Consonanat");
			}
	}

}
