package com.ForLoop1;

import java.util.Scanner;

public class PrintTable {
	public static int table(int num) {
		int i,num1;
		for(i=1;i<=10;i++) {
		System.out.println(i+"*"+num+"="+(i*num));
	}
		return num;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num,i;
		System.out.println("Enter number");
		num = sc.nextInt();
		int res=table(num);
		System.out.println("res"+res);
		}

	}


