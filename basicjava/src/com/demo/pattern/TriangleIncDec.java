package com.demo.pattern;

public class TriangleIncDec {
  public static void pattern(int rows) {
	  int i,j;
	  for(i=0;i<=rows;i++) {
		  for(j=1;j<=i;j++) {
			  System.out.print("* ");
		  }
		  System.out.println();
	  }
	  }
	  public static void pattern3(int rows) {
			int i,j;
			
			for(i=1;i<=rows;i++) {
				for(j=rows;j>=i;j--) {
					System.out.print("$ ");
				}
				System.out.println();
			}
  }
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       pattern(5);
       pattern3(5);
	}

}
