package com.demo.datatype;

import java.util.Scanner;

public class Biodata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter name");
	    String name=sc.nextLine();
	    System.out.println("name"+name);
	    
	    System.out.println("Enter age");
	    int age=sc.nextInt();
	    System.out.println("age:"+age);
	    
	    System.out.println("Enter height");
	    float height =sc.nextFloat();
	    System.out.println("height:"+height);
     
     
	}

}
