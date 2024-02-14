package com.demo.method;

import java.util.Scanner;

public class Test_Method2 {
    public static void display(String name) {
       System.out.println("name: "+name);
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name;
		System.out.println("Enter name");
		name=sc.next();
		display(name);

	}

}
