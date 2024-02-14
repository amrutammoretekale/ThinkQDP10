package com.wordlogical;

import java.util.Arrays;

public class SplitString {
	static void divideString(String s,int noofc) {
		int len=s.length();
		int ns=len/noofc;
		if(len%noofc!=0) {
			System.out.println("Cannot divide into equal part");
			
		}
		else
		{
			String spltstr[]=new String[ns]; 
			int index=0;
			for(int i=0;i<s.length();i+=noofc) {
				spltstr[index]=s.substring(i,i+noofc);
				index++;
			}
			
			System.out.println(Arrays.toString(spltstr));
		}
	}
	static void divideStringByAddHash(String s,int noofc) {
		int len=s.length();
		if(len%noofc!=0) {
			//remaining charctors
			int x=noofc-(len%noofc);
			for(int i=0;i<x;i++) {
				s=s+"#";
				//s=s.concat("#");
			}
		}
		//System.out.println(s);
		len=s.length();
		int ns=len/noofc;
		if(len%noofc!=0) {
			System.out.println("Cannot divide into equal part");
			
		}
		else
		{
			String spltstr[]=new String[ns]; 
			int index=0;
			for(int i=0;i<s.length();i+=noofc) {
				spltstr[index]=s.substring(i,i+noofc);
				index++;
			}
			
			System.out.println(Arrays.toString(spltstr));
		}
	}
	

	public static void main(String[] args) {
	String arr[]= {"I","am","very","smart"};
	
	System.out.println(Arrays.toString(arr));
	String st=String.join("", arr);
	//System.out.println(st);
	//int noofc=3;
	//divideString(st, noofc);
	int noofc=5;
//	divideString(st, noofc);
	divideStringByAddHash(st, noofc);

	}

}
