package com.demo.pattern;

public class TriangleInc12233 {
	public static void printpatren(int row) {
		int i,j;
		for(i=1;i<=row;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	public static void pattern2(int row) {
		int i,j;
		for(i=1;i<=row;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public static void pattern(int row) {
		int i,j;
		for(i=1;i<=row;i++) {
			for(j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		printpatren(5);
		pattern2(5); 
		 pattern(5);

	}

}
