package com.pattern;

public class TriangleA_AB_ABC_Inc {
	public static void pattern() {
		
	
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
		pattern();

	}

}
