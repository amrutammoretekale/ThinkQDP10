package com.example1;

public class StringImmutable {

	public static void main(String[] args) {
		String s1="java";
		//when an String obj is returned then the obj is created in heap not in scp
		s1.concat("progams");//here a new String is created javaprogram
		
		System.out.println(s1);
		String s2="java";
		s2=s1.concat("Programs");//here object is created in heap which is then sored in scp
		System.out.println(s2);
		System.out.println(s2.hashCode());
		
		String s3="javaprorams";
		System.out.println(s3.hashCode());
		System.out.println("---------------------");
		
		System.out.println(s2==s3);
		System.out.println(s2.equals(s3));

	}

}
