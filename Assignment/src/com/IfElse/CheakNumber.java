package com.IfElse;

import java.util.Scanner;
//WAP to cheak weather the number is positive ,negative or zero.
public class CheakNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int num;
    System.out.println("Enter  the number");
    num=sc.nextInt();
   
    if(num>0) {
    	System.out.println("number is positive");
    	
    }
    else if(num<0) {
    	System.out.println("number is Negative");
    }
    else{
    	System.out.println("Number is zero");
    }
	}

}
