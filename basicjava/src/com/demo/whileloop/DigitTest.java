package com.demo.whileloop;

import java.util.Scanner;

public class DigitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
  int num,rem;
  System.out.println("Enter the number");
  num=sc.nextInt();
  while(num!=0) {
  rem=num%10;//rem
  num=num/10;//quetiont
  
  System.out.println(rem+"next number"+num);
	}
	}
}
