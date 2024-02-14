package com.demo.whileloop;

import java.util.Scanner;

public class CountDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
  int count=0,num;
  System.out.println("Enter the number");
  num=sc.nextInt();
  while(num!=0) {
	
	  num=num/10;
	  count++;
	}
  System.out.println("number:"+count);
	}
}
