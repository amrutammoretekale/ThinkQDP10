package com.pattern;

public class Sqr_101010 {
	public static void pattern(int row) {
	  int i,j,temp=1;
	  for(i=1;i<=5;i++) {
		  for(j=1;j<=5;j++){
			  System.out.print(temp);
			 if(temp==1)
				 temp=0;
			 else
				 temp=1;
			 
				 		  }
		         System.out.println();
			     }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      pattern(5);
	}

}
