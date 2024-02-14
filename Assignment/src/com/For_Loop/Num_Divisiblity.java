package com.For_Loop;

import java.util.Scanner;

public class Num_Divisiblity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
  int num,i;
  System.out.println("Enter the number");
  num=sc.nextInt();
  for(i=0;i<=100;i++);{
	  if(num%5==0 && num%11==0) 
		  System.out.println("number is divisible by 5 & 11");
		  
  }
  
  }
}
