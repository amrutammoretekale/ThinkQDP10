package com.demo.pattern;

public class HalfDia2 {
	public static void printpattern(int n) {
		int i,j,k;
		for(i=n;i>=1;i--) {
			//space
			for(k=i;k<=n;k++) {
				System.out.print(" ");
			}
			//*
			for(j=i;j>=1;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printpattern(4);

	}

}
