package com.while_Loop;

import java.util.Scanner;

public class FInd_Power {
	
		public static int power(int base,int pow) {
			int i;
			int p=1;
			for(i=1;i<=pow;i++) {
				p*=base;//p=p*base;
				}return p;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int base,pow;
		System.out.println("Enter base");
		base=sc.nextInt();
		System.out.println("Enter pow");
		pow=sc.nextInt();
		 System.out.println(power(base,pow));

	}

}
