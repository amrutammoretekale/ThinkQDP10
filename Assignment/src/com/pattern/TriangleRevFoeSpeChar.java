package com.pattern;

public class TriangleRevFoeSpeChar {
	public static void pattern(int rows) {
		int i,j;
		
		for(i=1;i<=rows;i++) {
			for(j=rows;j>=i;j--) {
				System.out.print("# ");
			}
			System.out.println();
		}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        pattern(5);
	}

}
