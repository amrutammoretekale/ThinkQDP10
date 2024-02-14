package com.ForLoop;

import java.util.Scanner;

public class PrintSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
  int num,sum=0;
  for(;sum<=50;) {
	  System.out.println("Enter the number");
	  num=sc.nextInt();
	  if(num<0) {
		  continue;
		  
	  }else if(num>0) {
		  sum=sum+num;
		  System.out.println("sum:"+sum);
		  
	  }
	  
  } System.out.println("You have reached to sum");
	}

}
