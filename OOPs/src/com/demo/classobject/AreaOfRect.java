package com.demo.classobject;

import java.util.Scanner;

public class AreaOfRect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int area,l,b;
	       Scanner sc=new Scanner(System.in);
	       System.out.println("Enter length");
	       l=sc.nextInt();
	       System.out.println("Enter breath");
	       b=sc.nextInt();
	       area=l*b;
	       System.out.println("area:"+area);

	}

}
