package com.pattern;

public class TriangleInc1to10 {
	public static void pattern() {
		int i,j;
		 int a=1;
		for(i=1;i<=4;i++){
			 
			for(j=1;j<=i;j++) {
				System.out.print(a);
				a++;
				
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern()
;
	}

}
