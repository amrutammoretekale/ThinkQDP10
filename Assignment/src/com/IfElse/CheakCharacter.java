package com.IfElse;

import java.util.Scanner;

public class CheakCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int ch;
	     System.out.println("Enter  the number");
	     ch=sc.nextInt();
	    
	     if((ch>='a' && ch<='z') ||(ch>='A'&& ch<='Z')){
	     	System.out.println(ch+"is Alphabet");
	     	
	     }
	     else if(ch>='0' && ch<='9') {
	     	System.out.println( ch+"is digit");
	     }
	     else{
	     	System.out.println(ch+" is Special character");
	}
	}
}
