package com.pattern;

public class Triangle5To1Rev{
	public static void pattern(int row) {
		  int i,j;
		  for(i=5;i>=1;i--) {
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
