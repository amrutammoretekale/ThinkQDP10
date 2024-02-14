package com.ForLoop;

import java.util.Scanner;

public class PrintNumDivBy5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 int i;
		System.out.println("Enter the Number");
		i=sc.nextInt();
  
  for(i=0;i<=100;i++) {
	  if(i%5==0) {
		  System.out.println(i);
	  }
	 
	  
  }
	}

}
