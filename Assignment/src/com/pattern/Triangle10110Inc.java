package com.pattern;

public class Triangle10110Inc {
	public static void pattern(int row) {
		  int i,j;
		  for(i=0;i<=5;i++) {
			  for(j=0;j<=i;j++){
				 
				 if(j%2==0)
					 System.out.print(1);
				 else
					System.out.print(0);
					 		  }
			         System.out.println();
				     }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           pattern(5);
	}

}
