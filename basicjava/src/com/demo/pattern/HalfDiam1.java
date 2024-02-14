package com.demo.pattern;

public class HalfDiam1 {
	public static void printpattern(int n) {
		int i,j,k;
		for(i=1;i<=n;i++) {
			//space
			for(k=n-1;k>=i;k--) {
				System.out.print(" ");
			}
			//*
			for(j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printpattern(5);

	}

}
