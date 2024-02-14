package com.example1;

public class MethodsOfString {

	public static void main(String[] args) {
		String str="java is fun.";
		System.out.println(str.length());
		//charAt
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(str.length()-1));
		
		//conca , +
		System.out.println("--------concat----------");
		String s1="Hello";
		String s2="World";
		//2 different object will be crerated "HelloWorld"in heap only
    
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		
		//substring
		System.out.println("---------sustring----------");
		System.out.println(str.substring(1));
		System.out.println(str.substring(1,6));
		
		//contains
		System.out.println("---------contains-----------");
		System.out.println(str.contains("ava"));
		System.out.println(str.contains("orl"));
		
		System.out.println("-------equalsIgnorsCase--------");
		String w1="hi";
		String w2="Hi";
		
		System.out.println(w1==w2);
		System.out.println(w1.equals(w2));//false
		
		System.out.println(w1.equalsIgnoreCase(w2));
		
		//upper case
		System.out.println("-------toUpper&LowerCase------");
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println("--------indexOf-------");
		//indexof ,lastindexof
		System.out.println(str.indexOf('a'));
		System.out.println(str.lastIndexOf('a'));
		
		System.out.println(str.indexOf("fun"));
		
		//trim
		System.out.println("-------trim---------");
		String st=" java   ";
		System.out.println(st+st.length());
		
		st=st.trim();
		System.out.println(st+st.length());

		 //replacce
		System.out.println("--------replae---------");
		System.out.println(st.replace('a', 'z'));
		System.out.println(st);
	}

}
