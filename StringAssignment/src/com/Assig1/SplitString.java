package com.Assig1;

import java.util.Arrays;

//10.	WAP to split string into 2 tokens where string is “HELLO$WORLD”
public class SplitString {

	public static void main(String[] args) {
		String str="Hello$world";
		String s[]=str.split("\\s");
		System.out.println(Arrays.toString(s));
	}

}
