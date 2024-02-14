package com.method;

import java.util.Scanner;

public class ProductOfDigit {
	public static int productdigit(int num) {
		int product=1,sum=0,rem;
		while(num!=0) {
		rem=num%10;
		product=product+rem;
		}
		return product;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int num;
       num=sc.nextInt();
       System.out.println("Enter number");
      int product=productdigit(num);
	}

}
