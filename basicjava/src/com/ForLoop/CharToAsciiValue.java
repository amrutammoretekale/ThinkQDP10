package com.ForLoop;

import java.util.Scanner;

public class CharToAsciiValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     char ch;
     System.out.println("Enter character");
     ch=sc.next().charAt(0);
     for(ch='a';ch<='z';ch++) {
    	 System.out.println(ch+"="+(int)ch);
     }
	}

}
