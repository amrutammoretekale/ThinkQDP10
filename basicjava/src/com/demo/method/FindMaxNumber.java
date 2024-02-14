package com.demo.method;

import java.util.Scanner;

public class FindMaxNumber {
public static int findmax(int n1,int n2) {
	if(n1>n2)
	   return n1;
	else 
		return n2;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n1");
		n1=sc.nextInt();
		System.out.println("Enter n2");
		n2=sc.nextInt();
		int max=findmax(n1,n2);
		System.out.println("max:"+max);

	}

}
