package com.demo.pattern;

public class Triangle1234To1Dec {
	public static void pattern(int row) {
		int i,j;
		for(i=4;i>=1;i--) {
			for(j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();	
		}
	}

	public static void main(String[] args) {
		pattern(4);                        

	}

}
