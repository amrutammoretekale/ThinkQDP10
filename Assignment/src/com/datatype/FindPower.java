package com.datatype;

import java.util.Scanner;

// Write a Java program to find power of any number x ^ y
public class FindPower {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x,y;
		System.out.println("Enter value of x");
		x=sc.nextInt();
		System.out.println("Enter value of y");
		y=sc.nextInt();
		 double res=Math.pow(x, 2);
		 double res1=Math.pow(y, 2);
      
        System.out.println("res:"+res);
        System.out.println("res1:"+res1);
	}

}
