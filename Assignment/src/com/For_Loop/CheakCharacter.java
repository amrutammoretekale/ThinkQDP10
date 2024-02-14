package com.For_Loop;

import java.util.Scanner;

public class CheakCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int i,n=1,alpha;
String alpha_str;
int ch='m';

System.out.println("Enter the string");
alpha_str=sc.nextLine();
for(i=0;i<=alpha_str.length();i++);{
	ch=sc.nextLine().charAt(i);
  if(ch>='a'&& ch<='z'|| ch>='A'&& ch<='Z');{
    System.out.println( ch+"is  alphabet");
  }
    }
	}

}
