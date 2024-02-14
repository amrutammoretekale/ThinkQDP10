package com.while_Loop;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method 
  Scanner sc=new Scanner(System.in);
  int num,rev=0,rem;
  System.out.println("Enter the number");
  num=sc.nextInt();
  while(num!=0) {
	  rem=num%10;
	  rev=rev*10+rem;
	  num=num/10;
  }
  
	}

}
