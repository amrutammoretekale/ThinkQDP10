package com.demo.whileloop;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
int num=1,sum=0; 


 while(num!=0) {
	 System.out.println("enter number");
	  sum+=sum+num;
	  num++;
	  
  }
  System.out.println("sum:"+sum);
	}

}
