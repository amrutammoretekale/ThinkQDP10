package com.pattern;

public class TriangleForABBCC {
	public static void pattern(char row) {
	  int i,j;
	  char ch='A';
	  
	  for(i=0;i<=5;i++) {
		  for(j=0;j<=i;j++){
			  System.out.print(ch);
		         }
		         ch++;
		         System.out.println();
			     }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    pattern('A');
	}

}
