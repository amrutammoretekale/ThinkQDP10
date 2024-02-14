package com.demo.datatype;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter value of a");
    int a=sc.nextInt();
    System.out.println("Enter value of b");
    int b=sc.nextInt();
    int sum=a+b;
    System.out.println("sum:"+sum);
	}

}
