package com.nestedfor_loop;

import java.util.Scanner;

public class Find_Fact {
	public static void printfact(int n) {
		int i,j,fact;
		for(i=1;i<=10;i++) {
			fact=1;
			for(j=1;j<=i;j++) {
				fact=fact*j;
			}
			System.out.println(i+"!="+fact);
		}
		
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		printfact(n); 

	}

}
