package com.For_Loop;
//WAP to cheak number is positive,negative or zero
import java.util.Scanner;

public class Cheak_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
  int num,i,n=0;
  System.out.println("Enter the number");
  num=sc.nextInt();
  
  for(i=0;i>=n;i++);
  {
	  if(num>0) {
		  System.out.println("number is positive");
	  }else if(num<0) {
		  System.out.println("number is negative");
	  }else {
		  System.out.println("number is zero");
	  }
	  
	  }
  }

}
