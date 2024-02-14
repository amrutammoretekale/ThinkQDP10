package com.datatype;

import java.util.Scanner;

public class PerimeterOfRect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int p,l,b;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter length");
       l=sc.nextInt();
       System.out.println("Enter breath");
       b=sc.nextInt();
       p=(l+b)*2;
       System.out.println("Perimeter:"+p);
       
	}

}
