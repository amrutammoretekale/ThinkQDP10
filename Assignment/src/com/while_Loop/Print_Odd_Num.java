package com.while_Loop;
//WAP to print odd numbers from 521 to 229 using while loop 
public class Print_Odd_Num {
	public static void printno(int num) {
		 int i=521;
		  while(i>=229) {
			  if(!(i%2==0))
			  System.out.println(i);
			  i--;
		  }
	}

	public static void main(String[] args) {
		int num = 1;
		// TODO Auto-generated method stub
		printno(num);
  
	}

}
