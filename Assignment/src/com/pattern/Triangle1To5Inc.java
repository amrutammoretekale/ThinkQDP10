package com.pattern;

public class Triangle1To5Inc {
	public static void pattern(int row) {
		  int i,j,temp=1;
		  for(i=1;i<=5;i++) {
			  for(j=1;j<=i;j++){
				  System.out.print(i);
			         }
			         System.out.println();
				     }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    pattern(5);
	}

}
