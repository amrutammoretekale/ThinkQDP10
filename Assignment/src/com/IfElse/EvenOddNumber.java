package com.IfElse;

import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    int num;
	    System.out.println("Enter Number:");
	    num=sc.nextInt();
	    
	    if(num%2==0){
	    	System.out.println("Number is Even");
	   
	    }else
	    {
	    	System.out.println("Number is odd");
	}
	}
}
