package com.example1;

public class EqualityCheak {

	public static void main(String[] args) {
		
		
		String s1="java";
		String s2="java";
		
		//compair referece to object
		System.out.println(s1==s2);//true
		//compai content
		System.out.println(s1.equals(s2));//true
		
		System.out.println("------");
		
		String s3=new String("java");
		s3=s3.intern();
		System.out.println(s1==s3);//false
		System.out.println(s1.equals(s3));//true
	}

}
