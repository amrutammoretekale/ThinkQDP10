package com.example.conditionalstatement;

import java.util.Scanner;

public class FindNoNegativeOrPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int num;
    System.out.println("Enter number");
    num=sc.nextInt();
    if(num>0) {
    	System.out.println(num+" is positive");
    }
    else if(num<0) {
    	System.out.println(num+" is negative");
    }
    else {
    	System.out.println(num+" is zero");
    }
	}

}
