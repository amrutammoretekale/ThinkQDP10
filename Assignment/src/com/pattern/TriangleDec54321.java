package com.pattern;

public class TriangleDec54321 {
	public static void pattern(int row) {
		  int i,j,temp=1;
		  for(i=1;i<=5;i++) {
			  for(j=5;j>=i;j--){
				  System.out.print(j);
			         }
			         System.out.println();
				     }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     pattern(5);
	}

}
