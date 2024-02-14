package com.forloop1;

import java.util.Scanner;

public class FindFactors {
	public static void fact(int n) {
		int i,fact = 1;
		int count=0;
		for(i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.println(i);
				count++;
			}
			
		}System.out.println("no of factor"+count);
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter num");
		num=sc.nextInt();
		fact(num);

	}

}
