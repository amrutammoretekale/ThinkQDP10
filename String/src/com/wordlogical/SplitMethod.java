package com.wordlogical;

import java.util.Arrays;

public class SplitMethod {

	public static void main(String[] args) {
		String str="i like to learn java";
		
		String [] s=str.split("\\s");
		System.out.println(Arrays.toString(s));

	}

}
