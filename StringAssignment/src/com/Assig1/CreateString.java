package com.Assig1;
//1.String create with new operator and without new
//2.Compare string using ==when we create without new see same reference is there
//3.Compare string using new operator when new is present see differentreference is there. 
//5.	Write a Java program to find length of a string.
//6.	Write a Java program to concatenate two strings.
public class CreateString {

	public static void main(String[] args) {
	String str="java";
	String str1=new String("programming");
    System.out.println(str==str1);//false
    //find length
    System.out.println(str.length());
    //concat String
    System.out.println(str.concat(str1));
    //compaire String
    System.out.println(str.equals(str1));
    //lower and upper String
    System.out.println(str.toLowerCase());
    System.out.println(str.toLowerCase());
    System.out.println(str1.toUpperCase());
    System.out.println(str1.toUpperCase());
    //copy String
    
    //
   
	}

}
