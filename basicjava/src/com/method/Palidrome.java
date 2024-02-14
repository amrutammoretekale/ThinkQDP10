package com.method;

import java.util.Scanner;

public class Palidrome {
	public static int rev(int num) {
		int rem,rev=0,n ;
		while(num!=0) {
			  rem=num%10;
			  rev=rev*10+rem;
			  num=num/10;
			  if(rev==num) {
				  
			  }
		}	   return rev;

	}  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
       Scanner sc=new Scanner(System.in);
       num=sc.nextInt();
       int num1=rev(num);
    
	}

}
