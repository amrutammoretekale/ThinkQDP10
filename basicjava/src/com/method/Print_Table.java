package com.method;

import java.util.Scanner;

public class Print_Table {
	public static int PrintTable(int num) {
		int i;
		for(i=1;i<=10;i++) {
			System.out.println(num+"*"+num+"="+(num*i));
		}
		return i;
		
	}

	public static void main(String[] args) {
	int num;	
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter number");
  num=sc.nextInt();
  System.out.println("PrintTable"+PrintTable(num));
	}

}
