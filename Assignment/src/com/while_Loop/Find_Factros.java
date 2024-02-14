package com.while_Loop;

import java.util.Scanner;

public class Find_Factros {
	public static void findfactors(int n) {
		int i;
		int count=0;
		
		for(i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("count:"+count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter num:");
		num=sc.nextInt();
		findfactors(num);

	}

}
